package com.xworkz.manju.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.manju")
public class ConfigurationPastries {
	
	public ConfigurationPastries() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	//used to process html form which
	@Bean
	public MultipartResolver multipartResolver() {
		System.out.println("Registering multipartResolver");
		return new StandardServletMultipartResolver();
		
	}
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver inResolver = new InternalResourceViewResolver("/", ".jsp");
		return inResolver;

	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean() {
		System.out.println("Registering containerEntityManagerFactoryBean..");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		return bean;
		
	}
	

}
