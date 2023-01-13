package com.xworkz.spring12.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
  
	private String name;
	private String type;
	@Autowired
	@Qualifier("engineNumber")
	private String number;
	@Autowired
	@Qualifier("engineVersion")
	private double version;
	private String company;
	private int strokes;
	
	public Engine(@Qualifier("engineName") String name,@Qualifier("engineType") String type,@Qualifier("engineCompany") String company) {
		this.name = name;
		this.type = type;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}
	
	public int getStrokes() {
		return strokes;
	}
	
	@Autowired
	@Qualifier("engineStrokes")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}
}
