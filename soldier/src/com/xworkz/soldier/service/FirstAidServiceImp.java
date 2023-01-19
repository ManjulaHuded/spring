package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDTO;
import com.xworkz.soldier.repo.FirstAidRepo;

@Component
public class FirstAidServiceImp implements FirstAidService {
	
	private Validator validator;
	private FirstAidRepo repo;
	
	public FirstAidServiceImp(FirstAidRepo repo) {
		this.repo=repo;
	}
	

	@Override
	public boolean validateAndSave(FirstAidDTO aidDto) {
		System.out.println("Running validateAndSave in FirstAidServiceImp");
		System.out.println("aidDto " + aidDto);
		
		Set<ConstraintViolation<FirstAidDTO>> violations =  this.validator.validate(aidDto);
		
		if(!violations.isEmpty()) {
			System.err.println("Validation error is there");
			violations.forEach(b->System.out.println(b.getMessage()));
			return true;
			}else {
				System.out.println("Validation is done...");
				boolean ree = this.repo.save(aidDto);
				System.out.println("Data saved using repo " + ree);
				return false;
			}
		
	}

}
