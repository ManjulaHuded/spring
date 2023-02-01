package com.xworkz.fi.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FoodInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public FoodInitializer() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
	System.out.println("Running getRootConfigClasses ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] cls = {FoodConfiguration.class};
		System.out.println("Running getServletConfigClasses ");
		return cls;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings ");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling");
	}

}
