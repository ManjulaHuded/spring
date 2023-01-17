package com.xworkz.validation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.validation.dto.TerroristDTO;

public class TerroristServiceImp implements TerroristService {
	
	public TerroristServiceImp() {
		System.out.println("TerroristServiceImp object is created");
	}

	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("Running validateAndSave in TerroristServiceImp");
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
	Set<ConstraintViolation<TerroristDTO>> violations =	validator.validate(dto);
	if(!violations.isEmpty()) {
		System.err.println("Error is there");
		violations.forEach(b->System.err.println(b.getMessage()));
		return false;
	}
	
	System.out.println("No validation error");
		return true;
	}

}
