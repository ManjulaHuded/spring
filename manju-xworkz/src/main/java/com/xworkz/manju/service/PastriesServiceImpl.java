package com.xworkz.manju.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.manju.dto.PastriesDTO;
import com.xworkz.manju.entity.PastriesEntity;
import com.xworkz.manju.repository.RepositoryPastries;

@Service
public class PastriesServiceImpl implements PastriesService {

	@Autowired
	private RepositoryPastries repositoryPastries;

	public PastriesServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<PastriesDTO>> validateAndSave(PastriesDTO dto) {
		System.out.println("Running validateAndSave method in service..");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<PastriesDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in dto" + dto);
			return violations;
		} else {
			System.out.println("There is no violations in dto,can save.. ");
			PastriesEntity entity = new PastriesEntity();
			entity.setId(dto.getId());
			entity.setName(dto.getName());
			entity.setColor(dto.getColor());
			entity.setPrice(dto.getPrice());
			entity.setType(dto.getType());
			entity.setFlavour(dto.getFlavour());
			boolean saved = repositoryPastries.save(entity);
			System.out.println("saving" + saved);

			return Collections.emptySet();
		}
	}

	@Override
	public PastriesDTO findById(int id) {
		if (id > 0) {
			PastriesEntity entity = this.repositoryPastries.findById(id);
			if (entity != null) {
				System.out.println("entity is found in service for id" + id);
				PastriesDTO dto = new PastriesDTO();
				dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setColor(entity.getColor());
				dto.setPrice(entity.getPrice());
				dto.setType(entity.getType());
				dto.setFlavour(entity.getFlavour());
				return dto;
			}

		}
		return PastriesService.super.findById(id);
	}

}
