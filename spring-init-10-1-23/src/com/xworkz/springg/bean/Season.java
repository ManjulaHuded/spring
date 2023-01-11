package com.xworkz.springg.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
   
	private String name;
	private String duration;
	private String startingMonth;
	
	public Season() {
		System.out.println("object for season");
	}
	
	public String getDuration() {
		return duration;
	}
	
	public String getStartingMonth() {
		return startingMonth;
	}
	
	
	public String getName() {
		return name;
	}
	
	@Value("Winter")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("nov to feb")
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	@Value("nov")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	
	
}
