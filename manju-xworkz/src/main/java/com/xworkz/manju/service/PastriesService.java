package com.xworkz.manju.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.manju.dto.PastriesDTO;

public interface PastriesService {

	Set<ConstraintViolation<PastriesDTO>> validateAndSave(PastriesDTO dto);

	default PastriesDTO findById(int id) {
		return null;

	}

	default List<PastriesDTO> findByColor(String color) {
		return null;
	}

	Set<ConstraintViolation<PastriesDTO>> validateAndUpdate(PastriesDTO dto);
}
