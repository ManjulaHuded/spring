package com.xworkz.friday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	
	@Autowired
	private Location location;
	
	public Company() {
		System.out.println("Company defualt constructor is created");
	}
	
	public Location refOfLocation() {
		Location ref = new Location();
	  return ref;	
	}
	
	

}
