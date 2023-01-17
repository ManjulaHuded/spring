package com.xworkz.validation.dto;


import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class AbstractAuidDTO implements Serializable{
	
	private String created;
	private LocalDateTime createdBy;
	private String updated;
	private LocalDateTime updatedBy;

}
