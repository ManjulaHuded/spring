package com.xworkz.springauto.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
   @Autowired
   @Qualifier("name2")
	private String name;
   @Autowired
   @Qualifier("version")
	private String version;
   @Autowired
   @Qualifier("developer")
	private String developer;
   @Autowired
	private long date;
   @Autowired
	private boolean free;
	
	public Software() {
		System.out.println("Software object is created");
	}

	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}
	
	
}
