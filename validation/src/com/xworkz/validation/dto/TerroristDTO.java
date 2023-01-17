package com.xworkz.validation.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Setter
@Getter
public class TerroristDTO extends AbstractAuidDTO {
	@NonNull
	@NotNull
	@Size(min=4,max=35,message ="Name is invalid, should be more than 4")
	private String name;
	@NonNull
	@Min(value =1,message = "Age should be more than 1")
	@Max(value = 100 ,message = "Age should be less than 100")
	private int age;
	@NonNull
	@NotNull
	@Size(min=3,max=20,message = "Country is invalid,should be more than 3")
	private String country;
	private boolean alive;
	private boolean prison;
	@NotNull
	@Size(min=2,max=40,message = "is invalid,should be more than 2")
	private String specialization;
	@NotNull
	@Size(min=5,max=25,message = "organization is invalid,should be more than 5")
	private String organization;
	

}
