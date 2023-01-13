package com.xworkz.friday.movie.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.friday.movie.bean.Battery;
import com.xworkz.friday.movie.bean.Camera;
import com.xworkz.friday.movie.bean.CameraMan;
import com.xworkz.friday.movie.bean.Director;
import com.xworkz.friday.movie.bean.Experience;
import com.xworkz.friday.movie.bean.Lens;
import com.xworkz.friday.movie.bean.Movie;
import com.xworkz.friday.movie.configuration.MovieConfiguration;

public class MovieTester {

	public static void main(String[] args) {
	
	ApplicationContext container = new AnnotationConfigApplicationContext(MovieConfiguration.class);	
	
	Battery refOfBattery = container.getBean(Battery.class);
	System.out.println(refOfBattery.refOfCapacity().hashCode() + " Hash code of capacity using battery");
	
	
	Camera refOfCamera = container.getBean(Camera.class);
	System.out.println(refOfCamera.refOfLens().hashCode() + " Hash code of lens using Camera");
	System.out.println(refOfCamera.refOfBattery().hashCode() + " Hash code of battery using Camera");
	
	CameraMan refOfCameraMan = container.getBean(CameraMan.class);
	System.out.println(refOfCameraMan.refOfCamera().hashCode() + " Hash code of Camera using CameraMan");
	
	Experience refOExperience = container.getBean(Experience.class);
	System.out.println(refOExperience.refOfSkill().hashCode() + " Hash code of skill using Experience");
	
	Director refOfDirector = container.getBean(Director.class);
	System.out.println(refOfDirector.refOfExperience().hashCode() + " Hash code of Experience using Director");
	
	Movie refOfMovie = container.getBean(Movie.class);
	System.out.println(refOfMovie.refOfDirector().hashCode() + "  Hash code of Director using Movie");
	System.out.println(refOfDirector.refOfExperience().hashCode() + " Hash code of Experience using Movie");
	
	}

}
