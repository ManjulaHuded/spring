package com.xworkz.soldier.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDTO;

@Component
public class FirstAidRepoImp implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO aidDto) {
		System.out.println("Running save");
		System.out.println("save " +aidDto);
		return false;
	}

}
