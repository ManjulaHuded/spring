package com.xworkz.air.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.air.dto.AirplaneDTO;
import com.xworkz.air.entity.AirplaneEntity;
import com.xworkz.air.repositry.RepositryAirplane;

@Service
public class ServiceAirplaneImpl implements ServiceAirplane {

	@Autowired
	private RepositryAirplane repositryAirplane;

	public ServiceAirplaneImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<AirplaneDTO>> validateAndSave(AirplaneDTO dto) {
		System.out.println("Running validateAndSave in service..");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AirplaneDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto" + dto);
			return violations;
		} else {
			System.out.println("There is no violations,can save..");
			AirplaneEntity entity = new AirplaneEntity();
			entity.setCompany(dto.getCompany());
			entity.setName(dto.getName());
			entity.setCost(dto.getCost());
			entity.setType(dto.getType());
			entity.setCountry(dto.getCountry());
			boolean saved = this.repositryAirplane.save(entity);
			System.out.println(saved);

			return Collections.emptySet();
		}

	}

	@Override
	public AirplaneDTO findById(int id) {
		if (id > 0) {
			AirplaneEntity entity = this.repositryAirplane.findById(id);
			if (entity != null) {
				System.out.println("Entity found in service for id" + id);
				AirplaneDTO dto = new AirplaneDTO();
				dto.setId(entity.getId());
				dto.setCompany(entity.getCompany());
				dto.setName(entity.getName());
				dto.setCost(entity.getCost());
				dto.setType(entity.getType());
				dto.setCountry(entity.getCountry());
				return dto;
			}

		}
		return ServiceAirplane.super.findById(id);
	}

}
