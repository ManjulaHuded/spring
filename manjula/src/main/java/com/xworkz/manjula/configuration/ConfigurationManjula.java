package com.xworkz.manjula.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.manjula")
public class ConfigurationManjula {
	
	public ConfigurationManjula() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

}
