package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.configuration.SpringConfiguration;
import com.xworkz.soldier.repo.ResortRepo;

public class ResortRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
	ResortRepo repo = container.getBean(ResortRepo.class);
	System.out.println(repo.hashCode());

	}

}
