package com.xworkz.egg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.EggDTO;
import com.xworkz.egg.service.ServiceEggApplication;

@Controller
@RequestMapping("/egg")
public class ControllerEggApplication {

	@Autowired
	private ServiceEggApplication eggApplication;

	public ControllerEggApplication() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onEgg(EggDTO dto, Model model) {
		System.out.println("onEgg .." + dto);
		model.addAttribute("hotelName", dto.getHotelName());
		model.addAttribute("dishName", dto.getDishName());
		model.addAttribute("type", dto.getType());
		model.addAttribute("price", dto.getPrice());
		model.addAttribute("quantity", dto.getQuantity());
		model.addAttribute("takeAway", dto.isTakeAway());
		boolean saved = eggApplication.validateAndSave(dto);
		System.out.println("saved .." + saved);
		return "index";

	}

}
