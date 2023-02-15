package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ValentineDTO {
	
	
	@Size(min=3,max=24,message="Name should more than 3 and less than 24")
	private String name;
	@Size(min=3,max=24,message="Valentine Name should more than 3 and less than 24")
	private String valentineName;
	@NotBlank(message="Place must be selected")
	private String place;
	@NotBlank(message="Gift must be selected")
	private String gift;
	

}
