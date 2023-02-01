package com.xworkz.fi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/share")
public class ComponentFood {

	public ComponentFood() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String taste(@RequestParam String name, @RequestParam String type, @RequestParam int quantity,
			@RequestParam double price) {
		System.out.println("Running taste...");
		System.out.println("Name: " + name);
		System.out.println("Type: " + type);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price: " + price);
		return "fooditem.jsp";

	}

}
