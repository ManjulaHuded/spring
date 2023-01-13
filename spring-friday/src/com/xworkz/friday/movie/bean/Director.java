package com.xworkz.friday.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {

	
	@Autowired
	private Experience experience;

	public Director() {
		System.out.println("Director defualt object is created");
	}

	public Experience refOfExperience() {
		Experience exp = new Experience();
		return exp;
	}

}
