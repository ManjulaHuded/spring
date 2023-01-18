package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.SoldierRepo;
import com.xworkz.soldier.repo.SoldierRepoImpl;
import com.xworkz.soldier.service.SoldierServiceImpl;

public class SoldierTester {

	public static void main(String[] args) {
		
		SoldierDTO dto = new SoldierDTO("Muttu", 20, "India", "Topper", "Xworkz");
		System.out.println(dto);
		
		SoldierServiceImpl service=new SoldierServiceImpl();
		SoldierRepo repos=new SoldierRepoImpl();
		service.setSave(repos);
		service.validateAndSave(dto);

	}

}
