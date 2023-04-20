package com.xworkz.signup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.signup.service.SignUpService;

import lombok.extern.slf4j.Slf4j;

@EnableWebMvc
@RestController
@RequestMapping("/")
@Slf4j
public class AjaxController {

	@Autowired
	private SignUpService service;

	public AjaxController() {
		log.info("Created" + this.getClass().getSimpleName());
	}

	@GetMapping(value = "/userName/{user}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String onUser(@PathVariable String user) {
		log.info("Running onUser in AjaxController" + user);
		Long dbUser = this.service.findByUser(user);
		System.err.println(dbUser);

		if (dbUser == 0) {
			System.err.println("Running in equals condition");
			return "";

		} else {
			return "UserID exsist";
		}
	}

	@GetMapping(value = "/email/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String onEmail(@PathVariable String email) {
		log.info("Running onEmail in AjaxController" + email);
		Long dbEmail = this.service.findByEmail(email);
		System.err.println(dbEmail);

		if (dbEmail == 0) {
			System.err.println("Running in equals condition");
			return "";
		} else {
			return "Email id exsist";
		}
	}

	@GetMapping(value = "/mobile/{number}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String onMobile(@PathVariable Long number) {
		log.info("Running onMobile in AjaxController" + number);
		Long dbNumber = this.service.findByMobile(number);
		System.err.println(dbNumber);

		if (dbNumber == 0) {
			System.err.println("Running in equals condition");
			return "";

		} else {
			return "Mobile Number exsist";
		}
	}

	@GetMapping(value = "/reemail/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String reEmail(@PathVariable String email) {
		Long dbEmail = this.service.findByEmail(email);
		System.err.println(dbEmail);

		if (dbEmail == 0) {
			System.err.println("Running in equals condition");
			return "Please enter Existing email";
		} else {
			return "";
		}
	}
}
