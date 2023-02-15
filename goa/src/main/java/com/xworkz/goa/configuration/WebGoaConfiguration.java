package com.xworkz.goa.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.goa")
public class WebGoaConfiguration {

		public WebGoaConfiguration() {
			System.out.println("Created " +this.getClass().getSimpleName());
		}
}
