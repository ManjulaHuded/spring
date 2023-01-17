package com.xworkx.monday.bean;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel {
	
	public Diesel() {
		System.out.println("Diesel object is created with no-args");
	}
	

	@Override
	public void consume() {
		System.out.println("Running consume method in diesel");
		
	}
	

}
