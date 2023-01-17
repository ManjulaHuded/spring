package com.xworkx.monday.browse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider {
	
	
	public Airtel() {
		System.out.println("Airtel object is created with no-args");
	}
	
	@Override
	public void connect() {
		System.out.println("Running conncet method in Airtel");
		
	}

}
