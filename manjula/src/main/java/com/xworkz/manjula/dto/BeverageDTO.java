package com.xworkz.manjula.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BeverageDTO {
	
	private String brandName;
	private int price;
	private LocalDate mfgDate;
	private LocalDate expiryDate;
	private String bevarageName;
	private int avalaibleIn;
	private double milkContentInGm;
	private double sugarContentInGm;	

}

