package com.xworkz.springg.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springg.bean.Rocket;

@Configuration
@ComponentScan
public class RocketConfigure {
   
	@Bean
	public Rocket launchPad() {
		System.out.println("registering the launchpad with spring");
		Rocket rock = new Rocket();
		return rock;
	}
	@Bean
	public Rocket launchPad1() {
		System.out.println("registering the launchpad one with spring");
		Rocket rock1 = new Rocket();
		return rock1;
	}
	
}
