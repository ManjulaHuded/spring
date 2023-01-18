package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SoldierDTO extends AbstractAuidDTO {
	
	@NotNull
	@NotBlank
	@Size(min=2,max=30,message = "Name is more than two and less than 30")
	private String name;
	@Min(value=3)
	@Max(value=35)
	private int id;
	@NotNull
	@NotBlank
	@Size(min = 5 ,max=35,message = "country is more than five and less than 35")
	private String country;
	@NotNull
	@NotBlank
	@Size(min=5,max=40,message = "Rank is more than five and less than 40")
	private String rank;
	@NotNull
	@NotBlank
	@Size(min=4,max=30,message = "Battalion is more than four and less than 30")
	private String battalion;
	
	

}
