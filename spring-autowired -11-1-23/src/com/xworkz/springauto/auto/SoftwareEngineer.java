package com.xworkz.springauto.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	
	@Autowired
	@Qualifier("name1")
	private String name;
	@Autowired
	@Qualifier("salary")
	private int salary;
	@Autowired
	@Qualifier("companyName")
	private String companyName;
	@Autowired
	@Qualifier("experience")
	private int experience;
	
	public SoftwareEngineer() {
		System.out.println("Software Engineer is created ");
	}
    
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public int getExperience() {
		return experience;
	}
	

}
