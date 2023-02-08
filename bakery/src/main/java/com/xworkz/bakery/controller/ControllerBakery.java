package com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.repositry.BakeryRepositryImpl;
import com.xworkz.bakery.service.BakeryServiceImpl;

@Controller
@RequestMapping("/sweet")
public class ControllerBakery {
	
	@Autowired
	private BakeryServiceImpl bakeryServiceImpl;
	@Autowired
	private BakeryRepositryImpl bakeryRepositryImpl;
	
	public ControllerBakery() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onBakery(BakeryDTO dto,Model model) {
		System.out.println("Running onBakery..");
		System.out.println(dto);
		model.addAttribute("name", dto.getName());
		model.addAttribute("ownerName", dto.getOwnerName());
		model.addAttribute("wifeName", dto.getWifeName());
		model.addAttribute("married", dto.isMarried());
		model.addAttribute("famousFor", dto.getFamousFor());
		model.addAttribute("since", dto.getSince());
	boolean saved =	bakeryServiceImpl.validateAndSave(dto);
	System.out.println(saved);
boolean saved1 =	bakeryRepositryImpl.save(dto);
System.out.println(saved1);
		return "BakerySuccess";
		
	}

}
