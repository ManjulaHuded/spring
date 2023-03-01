package com.xworkz.manju.controller;

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

import com.xworkz.manju.dto.PastriesDTO;
import com.xworkz.manju.service.PastriesService;

@Controller
@RequestMapping("/")
public class ControllerPastries {

	@Autowired
	private PastriesService pastriesService;

	private List<String> types = Arrays.asList("Flaky", "Shortcrust", "Puff", "Choux", "Filo");
	private List<String> flavours = Arrays.asList("Chocolate", "Strawberry", "Black", "Blueberry", "Red velvet pastry",
			" Chocolate pastry", " Pineapple pastry", " Mango pastry", " Vanilla pastry", " fruit pastry",
			" Oreo pastry", "Butterscotch pastry", "Coffee");

	public ControllerPastries() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/past")
	public String onPastries(Model model) {
		System.out.println("Running onPastries in get method..");
		model.addAttribute("types", types);
		model.addAttribute("flavours", flavours);
		return "Pastries";

	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running search for id in get method" + id);
		PastriesDTO dto = this.pastriesService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not found!..");
		}
		return "SearchPastries";

	}

	@PostMapping("/past")
	public String onPastries(PastriesDTO dto, Model model) {
		System.out.println("Running onPastries in post method.." + dto);
		Set<ConstraintViolation<PastriesDTO>> violations = pastriesService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No violations in controller go to success page..");
			return "Pastries";
		}

		model.addAttribute("types", types);
		model.addAttribute("flavours", flavours);
		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);
		System.err.println("violations in controller.");
		return "Pastries";

	}

	@GetMapping("/searchByColor")
	public String onSearchByColor(@RequestParam String color, Model model) {
		System.out.println("Running onSearchColor in controller" + color);
		List<PastriesDTO> list = this.pastriesService.findByColor(color);
		model.addAttribute("list", list);

		return "SearchColor";

	}

	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) {
		System.out.println("Running  onUpdate in get method.." + id);
		PastriesDTO dto = this.pastriesService.findById(id);
		model.addAttribute("dto", dto);
		model.addAttribute("types", types);
		model.addAttribute("flavours", flavours);
		return "UpdatePastries";

	}

	@PostMapping("/update")
	public String onUpdate(PastriesDTO dto, Model model) {
		System.out.println("Running onUpdate in post method" + dto);
		Set<ConstraintViolation<PastriesDTO>> violations = this.pastriesService.validateAndUpdate(dto);
		if(violations.size()>0) {
			model.addAttribute("error", violations);
			
		}else {
			model.addAttribute("message", "Pastries updated SuccessFully..");
		}
		return "UpdatePastries";
	}
}
