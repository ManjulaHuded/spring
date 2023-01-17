package com.xworkx.monday.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkx.monday.bean.PetrolBunk;
import com.xworkx.monday.configuration.MondayConfiguration;

public class Runner {
	
	public static void main(String[] args) {
		
	ApplicationContext container = new AnnotationConfigApplicationContext(MondayConfiguration.class);
	
//	Shell refOfShell = container.getBean(Shell.class);
//	refOfShell.purchase(); //internally calls refOfPetrol.comsune();
	
	PetrolBunk refOfPetrolBunk = container.getBean(PetrolBunk.class);
	refOfPetrolBunk.purchase();
	}

}
