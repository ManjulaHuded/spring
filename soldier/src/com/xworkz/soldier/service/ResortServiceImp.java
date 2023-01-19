package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.ResortDTO;
import com.xworkz.soldier.repo.ResortRepo;

@Component
public class ResortServiceImp implements ResortService {
	
	private Validator validator;
	private ResortRepo resort;

	@Override
	public boolean validateAndSave(ResortDTO reDto) {
		System.out.println("Running validateAndSave in ResortServiceImp ");
		System.out.println("reDto passed " + reDto);
		
	Set<ConstraintViolation<ResortDTO>> violations = this.validator.validate(reDto);
	if(!violations.isEmpty()) {
		System.err.println("Validation error is there");
		violations.forEach(b->System.err.println(b.getMessage()));
		
		return true;
		}else {
			System.out.println("Validation is done..");
			System.out.println("save reDto " + reDto);
		boolean saved =	this.resort.save(reDto);
		System.out.println(saved);
		}
		
		return false;
	
	}

}
