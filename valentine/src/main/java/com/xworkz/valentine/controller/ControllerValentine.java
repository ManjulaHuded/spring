package com.xworkz.valentine.controller;

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

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.service.ServiceValentine;

@Controller
@RequestMapping("/valentine")
public class ControllerValentine {

	@Autowired
	private ServiceValentine serviceValentine;

	private List<String> places = Arrays.asList("BTM", "Indra Nagar", "Bagalkot", "Mudhol", "Bilagi", "Lal Bagh","Goa");
	private List<String> gifts = Arrays.asList("Chocolate", "Teddy", "I-Phone", "Saree", "Watch");

	public ControllerValentine() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping
	public String onControllerValentine(Model model) {
		System.out.println("Running onControllerValentine Get method");
		
		model.addAttribute("places",places);
		model.addAttribute("gifts", gifts);

		return "Valentine";

	}

	@PostMapping
	public String onControllerValentine(ValentineDTO dto, Model model) {
		System.out.println("Running onControllerValentine Get method" + dto);
		Set<ConstraintViolation<ValentineDTO>> violations = serviceValentine.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No violations in controller go to success page..");
			return "ValentineSuccess";
		}
		model.addAttribute("places",places);
		model.addAttribute("gifts", gifts);
		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);
		System.err.println("violations in controller.");
		return "Valentine";

	}

}
