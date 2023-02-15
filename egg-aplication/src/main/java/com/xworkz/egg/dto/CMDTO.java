package com.xworkz.egg.dto;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CMDTO {

	@NotNull
	@Size(min = 4, max = 20, message = "Name lenght should be More than 4 and less than 20 ")
	private String name;
	@NotNull
	private String party;
	@NotNull
	private String state;
	@NotNull
	private Integer tenure;
	@NotNull
	@Size(min = 4, max = 20, message = "Portfolio lenght should be More than 4 and less than 20 ")
	private String portfolio;

}
