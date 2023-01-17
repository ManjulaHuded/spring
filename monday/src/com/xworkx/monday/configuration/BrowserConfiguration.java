package com.xworkx.monday.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkx.monday.bean.Diesel;
import com.xworkx.monday.bean.Fuel;
import com.xworkx.monday.bean.Petrol;
import com.xworkx.monday.bean.PetrolBunk;
import com.xworkx.monday.bean.Shell;

@Configuration
@ComponentScan(basePackages = "com.xworkx.monday",
excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
value = {MondayConfiguration.class,Diesel.class,PetrolBunk.class,Petrol.class,Fuel.class,Shell.class})})

public class BrowserConfiguration {
	
	public BrowserConfiguration() {
		System.out.println("BrowserConfiguration is created");	
		
	}

}
