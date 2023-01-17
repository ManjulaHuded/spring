package com.xworkx.monday.browse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser {
	@Autowired
	@Qualifier("airtel")
	private Provider airtel;
	@Autowired
	@Qualifier("jio")
	private Provider jio;
	
	public Chrome() {
		System.out.println("Chrome object is created with no-args");
	}
	
	@Override
	public void browse() {
		System.out.println("Runing browse in chrome method");
		airtel.connect();
		jio.connect();
		
	}

}
