package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDTO;
import com.xworkz.soldier.repo.MissileRepo;

@Component
public class MissileServiceImp implements MissileService {
	
	private Validator validator;
	private MissileRepo missile;

	@Override
	public boolean validateAndSave(MissileDTO miDto) {
		System.out.println("validateAndSave is running in MissileServiceImp");
		System.out.println("miDto passed " +miDto);
		
	Set<ConstraintViolation<MissileDTO>> violations = validator.validate(miDto);
	
	
	if(!violations.isEmpty()) {
		System.err.println("There is validation error");
		violations.forEach(b->System.err.println(b.getMessage()));
		return false;
	}else {
		System.out.println("Validation is done..");
	boolean saved =	this.missile.save(miDto);
	System.out.println(saved);
	}
		
		return true;
	}

}
