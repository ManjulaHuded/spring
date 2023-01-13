package com.xworkz.springauto.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springauto.auto.SoftwareEngineer;
import com.xworkz.springauto.configuration.ItemsConfiguration;

public class SoftwareTester {
  public static void main(String[] args) {
	ApplicationContext spring = new AnnotationConfigApplicationContext(ItemsConfiguration.class);

	 SoftwareEngineer soft = spring.getBean(SoftwareEngineer.class);
	 System.out.println(soft.getName());
	 System.out.println(soft.getCompanyName());
	 System.out.println(soft.getExperience());
	 System.out.println(soft.getSalary());
  
  
  }
}
