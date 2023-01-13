package com.xworkz.friday.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.friday.bean.Company;
import com.xworkz.friday.bean.Location;
import com.xworkz.friday.bean.Producer;
import com.xworkz.friday.configuration.ConfigurationFriday;

public class Runner {

	public static void main(String[] args) {
  
	ApplicationContext container =
 new AnnotationConfigApplicationContext(ConfigurationFriday.class);
	
 Location refOfLocation = container.getBean(Location.class);
 System.out.println(refOfLocation.refOfArea().hashCode() + " Hash code of area using location");

 Company refOfCompany = container.getBean(Company.class);
 System.out.println(refOfCompany.refOfLocation().hashCode() + " Hash code of location using company");

 Producer reOfProducer = container.getBean(Producer.class);
 System.out.println(reOfProducer.refOfCompany().hashCode() + "Hash code of company using producer");
 System.out.println(reOfProducer.refOfAssistant().hashCode() + " Hash code of assistant using producer");
 
	
	
	}

}
