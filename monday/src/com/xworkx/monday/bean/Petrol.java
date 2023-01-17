package com.xworkx.monday.bean;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel{
	
	public Petrol() {
		System.out.println("Petrol object is created with no-args");
	}

	@Override
	public void consume() {
		System.out.println("running consume in petrol");
		
	}

}
