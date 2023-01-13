package com.xworkz.springg.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springg.bean.Season;

@Configuration
public class SeasonConfigure {
   
	@Bean
	public Season winterSeason() {
		System.out.println("winter Season registering with spring");
		Season sea = new Season();
		return sea;
	}
	
	@Bean
	public Season rainySeason() {
		System.out.println("rainy Season registering with spring");
	
		
		Season sea1 = new Season();
		sea1.setDuration("July to oct");
		sea1.setStartingMonth("july");
		sea1.setName("rainy");
		return sea1;
		
	}
}
