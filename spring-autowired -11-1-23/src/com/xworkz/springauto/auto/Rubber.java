package com.xworkz.springauto.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
   
	 @Autowired
	    @Qualifier("name4")
		private String name;
	    @Autowired
	    @Qualifier("type1")
		private String type;
	    @Autowired
	    @Qualifier("color1")
		private String color;
	    @Autowired
	    @Qualifier("shape1")
		private String shape;
	    @Autowired
		private double price;
	    @Autowired
	    @Qualifier("stolen1")
		private boolean stolen;
	    
	    public Rubber() {
			System.out.println("Rubber object is created");
		}

		@Override
		public String toString() {
			return "Rubber [name=" + name + ", type=" + type + ", color=" + color + ", shape=" + shape + ", price="
					+ price + ", stolen=" + stolen + "]";
		}
	    
	    
}
