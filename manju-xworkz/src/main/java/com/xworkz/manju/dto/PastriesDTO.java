package com.xworkz.manju.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PastriesDTO {
	
	private int id;
	@Size(min=3,max=24,message="Name should more than 4 and less than 24")
	private String name;
	@Min(value = 80,message = "Min price 80 And Max 200")
	@Max(value = 200,message = "Min price 80 And Max 200")
	private int price;
	@NotBlank(message="flavour must be selected")
	private String flavour;
	@NotBlank(message="type must be selected")
	private String type;
	@Size(min=3,max=24,message="color should more than 3 and less than 20")
	private String color;
	
	

}
