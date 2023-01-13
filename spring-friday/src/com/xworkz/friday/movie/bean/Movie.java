package com.xworkz.friday.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {

	@Autowired
	private Director director;
	@Autowired
	private CameraMan cameraMan;

	public Director refOfDirector() {
		Director dir = new Director();
		return dir;
	}

	public CameraMan refOfCameraMan() {
		CameraMan man = new CameraMan();
		return man;
	}

}
