package com.xworkx.monday.browse;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {
	
	
	public Jio() {
		System.out.println("Jio object is created with no-args");
	}

	@Override
	public void connect() {
		System.out.println("Running connect method in Jio");
		
	}

}
