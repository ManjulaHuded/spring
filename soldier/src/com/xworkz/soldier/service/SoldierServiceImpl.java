package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.SoldierRepo;

public class SoldierServiceImpl implements SoldierService {

	private SoldierRepo save;
	
	public void setSave(SoldierRepo save) {
		this.save = save;
	}

	public SoldierServiceImpl() {
		System.out.println("SoldierServiceImpl is created");
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("Running validateAndSave in SoldierServiceImpl");
		System.out.println("dto passing " + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.err.println("There is validation error");
			violations.forEach(v->{System.err.println("violating message "+v.getMessage());});
			return false;
		} else {
			System.out.println("data is valid");
			 boolean save1 =save.save(dto);
			 System.out.println("dto saved using repo "+save1);
			 return save1;
		}	
		}
		

}
