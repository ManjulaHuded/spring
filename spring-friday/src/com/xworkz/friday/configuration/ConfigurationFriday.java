package com.xworkz.friday.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( "com.xworkz.friday" )
public class ConfigurationFriday {
	
	public ConfigurationFriday() {
		System.out.println("ConfigurationFriday defualt constructor created");
	}

} 
