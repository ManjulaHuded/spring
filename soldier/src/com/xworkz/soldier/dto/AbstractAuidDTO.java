package com.xworkz.soldier.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class AbstractAuidDTO implements Serializable  {
	
	private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updateDate;
	

}
