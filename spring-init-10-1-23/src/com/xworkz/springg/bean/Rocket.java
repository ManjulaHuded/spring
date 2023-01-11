package com.xworkz.springg.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
    @Value("India")
	private String country ;//= "India";
    @Value("PSLVC")
	private String name ;//= "PSLVC";
    @Value("100000.0")
	private double budget; //= 100000.0 ;
	
	public Rocket() {
		System.out.println("roket object is created");
	}
	
	public double getBudget() {
		return budget;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCountry() {
		return country;
	}
	
	
}
