package com.xworkz.validation.boot;

import com.xworkz.validation.dto.TerroristDTO;
import com.xworkz.validation.service.TerroristServiceImp;

public class Runner {

	public static void main(String[] args) {
		
		TerroristDTO dto = new TerroristDTO();
		dto.setName("manju");
		dto.setAge(25);
		dto.setCountry("Pakistan");
		dto.setSpecialization("Uneducated");
		dto.setOrganization("PakiCompany");
		System.out.println(dto);
		
		TerroristServiceImp service = new TerroristServiceImp();
		service.validateAndSave(dto);
		
		

	}

}
