package com.xworkz.manju.configuration;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class PastriesInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {
	
	public PastriesInitializer() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses..");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses");
		return new Class[] {ConfigurationPastries.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings..");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Override
	protected void customizeRegistration(Dynamic registration) {
		String tempDir="D://temp";
		int maxUploadSizeInMb = 3*1024*1024;//max length
		File uploadDirectory = new File(tempDir);//path used by server
		MultipartConfigElement multipartConfigElement=new MultipartConfigElement(uploadDirectory.getAbsolutePath(),maxUploadSizeInMb,maxUploadSizeInMb*2,maxUploadSizeInMb/2);
		registration.setMultipartConfig(multipartConfigElement);
	}

}
