package com.xworkz.soldier.repo;

import com.xworkz.soldier.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo {
	
	public SoldierRepoImpl() {
		System.out.println("SoldierRepoImpl object is created");	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("save method running in SoldierRepoImpl");
		System.out.println("save dto " +dto);
		return false;
		
	}

	
	


}
