package com.xworkz.soldier.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.ResortDTO;

@Component
public class ResortRepoImp implements ResortRepo {

	@Override
	public boolean save(ResortDTO reDto) {
		System.out.println("save is running ResortRepoImp" + reDto);
		System.out.println("save reDto " + reDto);
		return true;
	}

}
