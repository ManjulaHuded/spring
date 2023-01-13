package com.xworkz.friday.movie.bean;

import org.springframework.stereotype.Component;

@Component
public class CameraMan {
  
	private Camera camera;
	
	public CameraMan() {
		System.out.println("CameraMan defualt object is created");
	}
	
	public Camera refOfCamera() {
		Camera cam = new Camera();
		return cam;
	}
}
