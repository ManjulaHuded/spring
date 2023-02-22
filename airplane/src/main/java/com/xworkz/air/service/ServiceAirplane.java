package com.xworkz.air.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.air.dto.AirplaneDTO;

public interface ServiceAirplane {

	Set<ConstraintViolation<AirplaneDTO>> validateAndSave(AirplaneDTO dto);

	default AirplaneDTO findById(int id) {
		return null;
	}

}
