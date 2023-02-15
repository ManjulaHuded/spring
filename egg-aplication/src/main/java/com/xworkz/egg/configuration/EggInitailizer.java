package com.xworkz.egg.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class EggInitailizer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public EggInitailizer() {
	System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses..");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses..");
		return new Class[] {ConfigurationEgg.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings...");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
