package com.xworkz.signup.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SignUpInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {
	
	public SignUpInitializer() {
		log.info("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("getServletConfigClasses");
		return new Class[] {SignUpConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		log.info("getServletConfigClasses");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	configurer.enable();
	}

}
