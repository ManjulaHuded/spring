package com.xworkz.friday.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
    
	@Autowired
	private Capacity capacity;
	
	public Battery() {
		System.out.println("Battery defualt object is created");
	}
	
	public Capacity refOfCapacity() {
		Capacity cap = new Capacity();
		return cap;
	}
}
