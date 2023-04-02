package com.xworkz.signup.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;

import lombok.Data;

@Data
public class AbstractAuditDTO implements Serializable  {
	
	@Column(name ="createdBy")
	private String createdBy;
	
	@Column(name = "createdDate")
	private LocalDateTime createdDate;
	
	@Column(name ="updatedBy")
	private String updatedBy;
	
	@Column(name ="updatedDate")
	private LocalDateTime updatedDate;

}
