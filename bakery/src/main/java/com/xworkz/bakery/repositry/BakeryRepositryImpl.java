package com.xworkz.bakery.repositry;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakeryDTO;

@Repository
public class BakeryRepositryImpl implements BakeryRepositry {

	public BakeryRepositryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(BakeryDTO bakeryDTO) {
		System.out.println("Running save...");
		return false;
	}

}
