package com.xworkx.monday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk {
	
	@Autowired
	//@Qualifier("petrol")
	private Fuel petrol;
	@Autowired
	private Fuel diesel;
	
	public Shell() {
		System.out.println("shell object is created with no-args");
	}

	@Override
	public void purchase() {
		System.out.println("Running purchase in shell");
		petrol.consume();
		diesel.consume();

	}

}
