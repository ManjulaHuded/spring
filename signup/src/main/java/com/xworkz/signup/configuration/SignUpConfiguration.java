package com.xworkz.signup.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan("com.xworkz.signup")
@Slf4j
public class SignUpConfiguration {

	public SignUpConfiguration() {
		log.info("Created" + this.getClass().getSimpleName());
	}

	@Bean
	public MultipartResolver multipartResolver() {
		log.info("registring MultipartResolver");
		return new StandardServletMultipartResolver();
	}

	@Bean
	public ViewResolver viewResolver() {
		log.info("registring ViewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		log.info("registering LocalContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
//		bean.setPackagesToScan("com.xworkz.sahana");
//		bean.setDataSource(dataSource());
//		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return bean;
	}

//	public DataSource dataSource() {
//		log.info("registering DataSource");
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/hibernate");
//		dataSource.setPassword("Xworkzodc@123");
//		dataSource.setUsername("root");
//		return dataSource;
//	}
}
