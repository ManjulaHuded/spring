package com.xworkz.springg.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springg.bean.Rocket;
import com.xworkz.springg.configure.RocketConfigure;

public class RocketTester {

	public static void main(String[] args) {
		
		ApplicationContext spring = 
	new AnnotationConfigApplicationContext(RocketConfigure.class);
		
		Rocket roc = spring.getBean("launchPad",Rocket.class);
		System.out.println(roc.getBudget() +" "+ roc.getCountry() +" "+ roc.getName());

		Rocket roc1 = spring.getBean("launchPad1",Rocket.class);
		System.out.println(roc1.getBudget() +" "+ roc1.getCountry() +" "+ roc1.getName());
	}

}
