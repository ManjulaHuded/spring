package com.xworkz.springauto.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
    @Autowired
    @Qualifier("name3")
	private String name;
    @Autowired
    @Qualifier("type")
	private String type;
    @Autowired
    @Qualifier("color")
	private String color;
    @Autowired
    @Qualifier("shape")
	private String shape;
    @Autowired
    @Qualifier("price")
	private double price;
    @Autowired
    @Qualifier("stolen")
	private boolean stolen;
	
	public Pencil() {
		System.out.println("Pencil object is created");
	}

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", color=" + color + ", shape=" + shape + ", price=" + price
				+ ", stolen=" + stolen + "]";
	}
	
	
}
