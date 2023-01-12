package com.xworkz.springauto.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springauto")
public class ItemsConfiguration {
	
	@Bean
	public String name() {
		System.out.println("registering name..");
		String str = new String("Heathers");
		return str;
	}
	
	@Bean
	public String address() {
		System.out.println("registering address..");
		return "Bagalkot";
	}
	
	@Bean
	public String ownerName() {
		System.out.println("registering ownerName..");
		return "Vaishanvi";
	}
	
	@Bean
	public int id() {
		System.out.println("registering id..");
		
		return 2548;
	}
	
	@Bean
	public String gstNo() {
		System.out.println("registering gstNo..");
		return "AFD541";
	}
	
	@Bean
	public String name1() {
		System.out.println("registering name1..");
		String str = new String("Anand");
		return str;
	}
	
	@Bean
	public int salary() {
		System.out.println("registering salary..");
		return 25000;
	}
	
	@Bean
	public String companyName() {
		System.out.println("registering companyName..");
		return "X-workz";
	}
	
	@Bean
	public int experience() {
		System.out.println("registering experience..");
		return 4;
	}
	
	@Bean
	public String name2() {
		System.out.println("registering name2..");
		return "java";
	}
	
	@Bean
	public String developer() {
		System.out.println("registering developer..");
		return "Oracle";
	}
	
	@Bean
	public String version() {
		System.out.println("registering version..");
		return "JDK 8";
	}
	
	@Bean
	public long date() {
		System.out.println("registering date..");
		return 1-06-2021;
	}
	
	@Bean
	public boolean free() {
		System.out.println("registering free..");
		return true;
	}
	
	@Bean
	public String name3() {
		System.out.println("registering name3..");
		return "Apsara";
	}
	
	@Bean
	public String color() {
		System.out.println("registering color..");
		return "Black";
	}
	
	@Bean
	public String shape() {
		System.out.println("registering shape..");
		return "Circle";
	}
	
	@Bean
	public double price() {
		System.out.println("registering price..");
		return 40.00;
	}
	
	@Bean
	public boolean stolen() {
		System.out.println("registering stolen..");
		return false;
	}
	
	@Bean
	public String type() {
		System.out.println("registering type..");
		return "Wood";
	}
	
	@Bean
	public String name4() {
		System.out.println("registering name4..");
		return "Nataraj";
	}
	
	@Bean
	public String color1() {
		System.out.println("registering color1..");
		return "White";
	}
	
	@Bean
	public String shape1() {
		System.out.println("registering shape1..");
		return "Rectangular";
	}
	
	@Bean
	public double price1() {
		System.out.println("registering price1..");
		return 20.00;
	}
	
	@Bean
	public boolean stolen1() {
		System.out.println("registering stolen1..");
		return false;
	}
	
	@Bean
	public String type1() {
		System.out.println("registering type1..");
		return "Rubber";
	}
	

}
