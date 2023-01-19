package com.xworkz.soldier.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDTO;

@Component
public class MissileRepoImp implements MissileRepo {
	
	public MissileRepoImp() {
		System.out.println("MissileRepoImp object is created");
	}

	@Override
	public boolean save(MissileDTO miDto) {
		System.out.println("save is running in MissileRepoImp " + miDto);
		System.out.println("miDto " + miDto);
		return true;
	}

}
