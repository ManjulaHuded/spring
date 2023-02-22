package com.xworkz.air.dto;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AirplaneDTO {
	
	private int id;
	@Size(min=3,max=20,message = "Company must be more than 3 and less than 20")
	private String company;
	@Size(min=3,max=20,message = "Name must be more than 3 and less than 20")
	private String name;
	private int cost;
	@NotEmpty(message = "Type must be selected")
	private String type;
	@NotEmpty(message = "Country must be selected")
	private String country;

}
