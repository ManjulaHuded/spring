package com.xworkz.signup.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.signup.dto.SignUpDTO;
import com.xworkz.signup.service.SignUpService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class SignUpController {

	@Autowired
	private SignUpService service;

	public SignUpController() {
		log.info("Created" + this.getClass().getSimpleName());
	}

	@GetMapping("/register")
	public String onSave(Model model) {
		log.info("GetMapping onSave in SignUpController");
		return "SignUp";
	}

	@PostMapping("/register")
	public String OnSave(SignUpDTO dto, Model model) {

		Set<ConstraintViolation<SignUpDTO>> violations = this.service.validateAndSave(dto);
		if (violations != null && violations.isEmpty()) {

			model.addAttribute("message", "data saved successfull");
			System.out.println("" + dto);
			model.addAttribute("dto", dto);
			return "SignUpSuccess";
		} else {
			model.addAttribute("errors", violations);
			model.addAttribute("message", "data not saved");
		}
		return "SignUp";
	}

	@PostMapping("/login")
	public String signIn(String userId, String password, Model model) {
		try {
			SignUpDTO dto = this.service.signIn(userId, password);
			if (dto != null) {
				log.info("User ID and password is matched");
				model.addAttribute("userId", dto.getUserId());
				return "SignInSuccess";
			}

		} catch (Exception e) {

		}

		model.addAttribute("match", "UserID OR Password is not matching");
		return "SignIn";

	}

}