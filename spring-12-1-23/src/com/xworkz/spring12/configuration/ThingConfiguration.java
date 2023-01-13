package com.xworkz.spring12.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring12")
public class ThingConfiguration {
	
	@Bean
	public String newsPaperName() {
		System.out.println("Registering newsPaperName");
		return "Prajavani";
	}
	
	@Bean
	public String ownerName() {
		System.out.println("Registering ownerName");
		return "K N Guruswami";
	}
	
	@Bean
	public String language() {
		System.out.println("Registering language");
		return "Kannada";
	}
	
	@Bean
	public double newsPaperPrice() {
		System.out.println("Registering newsPaperPrice");
		double dou = new Double(6.0);
		return dou;
	}
	
	@Bean
	public int newsPaperId() {
		System.out.println("Registering newsPaperId");
		return 52845;
	}
	
	@Bean
	public String engineName() {
		System.out.println("Registering engineName");
		return "Disel Engine";
	}
	
	@Bean
	public String engineType() {
		System.out.println("Registering engineType");
		return "ICE";
	}
	
	@Bean
	public double engineVersion() {
		System.out.println("Registering engineVersion");
		return 1.5;
	}
	
	@Bean
	public String engineCompany() {
		System.out.println("Registering engineCompany");
		return "Starligth Auto Mall";
	}
	
	@Bean
	public String engineNumber() {
		System.out.println("Registering engineNumber");
		return "AE455";
	}
	
	@Bean
	public int engineStrokes() {
		System.out.println("Registering engineStrokes");
		return 2;
	}
	
	@Bean
	public String snakeName() {
		System.out.println("Registering snakeName");
		return "King Cobra";
	}
	
	@Bean
	public String snakeColor() {
		System.out.println("Registering snakeColor");
		return "Black with White strips";
	}
	
	@Bean
	public String snakeType() {
		System.out.println("Registering snakeColor");
		return "Poisionous";
	}
	
	@Bean
	public double snakeLength() {
		System.out.println("Registering snakeColor");
		return 15.0;
	}
	
	@Bean
	public boolean snakePoisionous() {
		System.out.println("Registering snakePoisionous");
		return true;
	}
	
	@Bean
	public String ghostName() {
		System.out.println("Registering ghostName");
		return "Mummy";
	}
	
	@Bean
	public int ghostAge() {
		System.out.println("Registering ghostAge");
		return 56;
	}
	
	@Bean
	public String ghostLastName() {
		System.out.println("Registering ghostLastName");
		return "Scary";
	}
	
	@Bean
	public LocalDate dateOfDeath() {
		System.out.println("Registering dateOfDeath");
		return LocalDate.of(2023, 3, 26);
	}
	
	@Bean
	public boolean isLegsTwisted() {
		System.out.println("Registering isLegsTwisted");
		return true;
	}
	
	@Bean
	public boolean isSucide() {
		System.out.println("Registering isSucide");
		return false;
	}
	
	@Bean
	public String profession() {
		System.out.println("Registering profession");
		return "Engineer";
	}
	
	@Bean
	public boolean isMarried() {
		System.out.println("Registering isMarried");
		return true;
	}
	
	@Bean
	public String motherName() {
		System.out.println("Registering motherName");
		return "Sonu";
	}
	
	@Bean
	public boolean naturalDeath() {
		System.out.println("Registering naturalDeath");
		return true;
	}
	
	@Bean
	public String ghostColor() {
		System.out.println("Registering ghostColor");
		return "Black";
	}
	
	@Bean
	public String fatherName() {
		System.out.println("Registering fatherName");
		return "Danu";
	}
	
	@Bean
	public String sisterName() {
		System.out.println("Registering sisterName");
		return "Bhagya";
	}
	
	@Bean
	public boolean isMurder() {
		System.out.println("Registering isMurder");
		return false;
	}
	
	@Bean
	public String brotherName() {
		System.out.println("Registering brotherName");
		return "Manu";
	}
	
	@Bean
	public String grandMotherName() {
		System.out.println("Registering grandMotherName");
		return "Sneha";
	}
	
	@Bean
	public String address() {
		System.out.println("Registering address");
		return "Bidar";
	}
	
	@Bean
	public double salary() {
		System.out.println("Registering salary");
		return 25000.0;
	}
	
	@Bean
	public boolean isChildren() {
		System.out.println("Registering isChildren");
		return true;
	}
	
	@Bean
	public int children() {
		System.out.println("Registering children");
		return 3;
	}
	
	
	
	
	
	
	

}
