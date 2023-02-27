package com.xworkz.manju.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.manju.dto.PastriesDTO;

public interface PastriesService {

	Set<ConstraintViolation<PastriesDTO>> validateAndSave(PastriesDTO dto);

	default PastriesDTO findById(int id) {
		return null;

	}

}
