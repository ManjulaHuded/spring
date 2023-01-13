package com.xworkz.springg.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springg.bean.Actor;

@Configuration
public class ActorConfigure {
   
	@Bean
	public Actor getActores() {
		System.out.println("actor is registering with spring..");
		Actor act = new Actor("Kiccha Sudeep", "Kannada", 49);
		return act;
		}
	
	@Bean
	public Actor getActoress() {
		System.out.println("actoress is registering with spring..");
		Actor act1 = new Actor("Puneeth Rajkumar", "Kannada", 46);
		return act1;
	}
	
	
}
