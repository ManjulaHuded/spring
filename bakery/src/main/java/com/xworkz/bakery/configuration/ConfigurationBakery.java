package com.xworkz.bakery.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.bakery")
public class ConfigurationBakery {
	
		public ConfigurationBakery() {
			System.out.println("Creayed " +this.getClass().getSimpleName());
		}
		
		@Bean
		public ViewResolver viewResolver() {
			InternalResourceViewResolver inResolver = new InternalResourceViewResolver("/", ".jsp");
			return inResolver;
			
		}

}
