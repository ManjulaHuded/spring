package com.xworkx.monday.browse;

import org.springframework.stereotype.Component;

//@Component
public class FireBox implements Browser {
	
	
	public FireBox() {
		System.out.println("FireBox object is created with no-args");
	}

	@Override
	public void browse() {
		System.out.println("Running browse in FireBox method");
		
	}

}
