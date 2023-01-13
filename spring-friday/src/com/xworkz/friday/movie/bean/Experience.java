package com.xworkz.friday.movie.bean;

import org.springframework.stereotype.Component;

@Component
public class Experience {
	
	private Skill skill;
  
	public Experience() {
		System.out.println("Experience defualt object is created");
	}
	
	public Skill refOfSkill() {
		Skill ski = new Skill();
		return ski;
	}
}
