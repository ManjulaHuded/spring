package com.xworkz.validation.service;

import com.xworkz.validation.dto.TerroristDTO;

public interface TerroristService {
	
	boolean validateAndSave(TerroristDTO dto);

}
