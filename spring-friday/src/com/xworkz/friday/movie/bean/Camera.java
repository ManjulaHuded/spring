package com.xworkz.friday.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	
	@Autowired
	private Lens lens;
	@Autowired
	private Battery battery;
	
	public Camera() {
		System.out.println("Lens defualt object is created");
	}
	
	public Lens refOfLens() {
		Lens len = new Lens();
		return len;
	}
	
	public Battery refOfBattery() {
		Battery battery = new Battery();
		return battery;
	}

}
