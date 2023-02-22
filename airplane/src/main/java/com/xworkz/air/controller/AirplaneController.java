package com.xworkz.air.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.air.dto.AirplaneDTO;
import com.xworkz.air.service.ServiceAirplane;

@Controller
@RequestMapping("/")
public class AirplaneController {

	@Autowired
	private ServiceAirplane airplane;

	private List<String> types = Arrays.asList("IndiGo", "Antonov An-32", "Boeing 787 Dreamliner", "Boeing 737",
			"Boeing 747", "Boeing 777");
	private List<String> countries = Arrays.asList("India", "Malaysia", "Japan", "New Zealand", "China", "USA");

	public AirplaneController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/airplane")
	public String onAirplane(Model model) {
		System.out.println("Running onAirplane on get method..");
		model.addAttribute("types", types);
		model.addAttribute("countries", countries);

		return "Airplane";

	}

	@GetMapping("/airplaneSearch")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running onSearch in get method." + id);
		AirplaneDTO dto = this.airplane.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "AirplaneSearch";

	}

	@PostMapping("/airplane")
	public String onAirplane(AirplaneDTO dto, Model model) {
		System.out.println("Running onAirplane on post method.." + dto);
		Set<ConstraintViolation<AirplaneDTO>> violations = airplane.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No violations in controller go to success page.. ");
			return "Airplane";
		}
		model.addAttribute("types", types);
		model.addAttribute("countries", countries);
		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);
		System.out.println("Violations in controller");

		return "Airplane";

	}

}
