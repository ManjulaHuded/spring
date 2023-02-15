package com.xworkz.egg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.egg.dto.EggDTO;
import com.xworkz.egg.repositry.RepositryEggApplication;
import com.xworkz.egg.repositry.RepositryEggApplicationImpl;

@Service
public class ServiceEggImpl implements ServiceEggApplication {

	@Autowired
	private RepositryEggApplication repositryEggApplication;

	public ServiceEggImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(EggDTO dto) {
		System.out.println("Running validateAndSave ServiceEggImpl..");
		boolean saved = repositryEggApplication.save(dto);
		System.out.println("save.." + saved);
		return false;
	}

}
