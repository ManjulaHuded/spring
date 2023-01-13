package com.xworkz.springg.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springg.bean.Season;
import com.xworkz.springg.configure.SeasonConfigure;

public class SeasonTester {

	public static void main(String[] args) {
		
		ApplicationContext spring =
		new AnnotationConfigApplicationContext(SeasonConfigure.class);
		
	Season see =spring.getBean("winterSeason",Season.class);
	System.out.println(see.getDuration());
	System.out.println(see.getName());
	System.out.println(see.getStartingMonth());
	
	Season see1 =spring.getBean("rainySeason",Season.class);
	System.out.println(see1.getDuration());
	System.out.println(see1.getName());
	System.out.println(see1.getStartingMonth());
	

	}

}
