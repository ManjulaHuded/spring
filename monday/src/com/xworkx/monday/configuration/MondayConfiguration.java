package com.xworkx.monday.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkx.monday")
public class MondayConfiguration {
	
	 public MondayConfiguration() {
		System.out.println("MondayConfiguration object is created");
	}

}
