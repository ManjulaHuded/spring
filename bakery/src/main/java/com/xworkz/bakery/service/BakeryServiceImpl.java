package com.xworkz.bakery.service;


import org.springframework.stereotype.Service;

import com.xworkz.bakery.dto.BakeryDTO;

@Service
public class BakeryServiceImpl implements BakeryService {
	
	public BakeryServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) {
		System.out.println("Running validateAndSave");
		return false;
	}

}
