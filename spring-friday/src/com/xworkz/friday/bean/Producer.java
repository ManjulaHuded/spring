package com.xworkz.friday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	
	@Autowired
	private Assistant assistant;
	@Autowired
	private Company company;
	
	public Producer() {
		System.out.println("Producer defualt constructor is created");
	}
	
	public Company refOfCompany() {
		Company com = new Company();
		return com;
	}
	
	public Assistant refOfAssistant() {
		Assistant ass = new Assistant();
		return ass;
	}
}
