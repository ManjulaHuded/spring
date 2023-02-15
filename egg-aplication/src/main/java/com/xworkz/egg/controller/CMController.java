package com.xworkz.egg.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.CMDTO;
import com.xworkz.egg.service.CMService;

@Controller
@RequestMapping("/cm")
public class CMController {

	@Autowired
	private CMService cmService;

	public CMController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onCM(CMDTO cmdto, Model model) {
		System.out.println("Running onCM " + cmdto);

	Set<ConstraintViolation<CMDTO>> constraintViolations = this.cmService.validateAndSave(cmdto);
		if(!constraintViolations.isEmpty()) {
			System.out.println("Validation is failed, display error message");
			constraintViolations.forEach((b)->System.err.println(b));
		}else {
			System.out.println("Validation success,display success message");
		}
		return "CM";

	}

}
