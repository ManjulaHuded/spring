package com.xworkz.friday.movie.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.friday.movie")
public class MovieConfiguration {
	
	public MovieConfiguration() {
		System.out.println("MovieConfiguration created with no-args");
	}
	
	

}
