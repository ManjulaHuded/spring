package com.xworkz.valentine.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.entity.EntityValentine;
import com.xworkz.valentine.repositry.RepositryValentineImpl;

@Service
public class ValentineServiceImpl implements ServiceValentine {

	@Autowired
	private RepositryValentineImpl repositryValentineImpl;

	public ValentineServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		System.out.println("Running validateAndSave..");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in dto" + dto);
			return violations;
		} else {
			System.out.println("violations is not there in dto,can save");
			EntityValentine entity = new EntityValentine();
			entity.setName(dto.getName());
			entity.setValentineName(dto.getValentineName());
			entity.setPlace(dto.getPlace());
			entity.setGift(dto.getGift());
			boolean saved = this.repositryValentineImpl.save(entity);
			System.out.println("saved .." + saved);
			return Collections.emptySet();
		}
	}

}
