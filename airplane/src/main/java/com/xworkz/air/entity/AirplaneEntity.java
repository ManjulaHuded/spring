package com.xworkz.air.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "airplane_table")
public class AirplaneEntity {

	@Id
	@Column(name = "a_id")
	private int id;
	@Column(name = "airplane_company")
	private String company;
	@Column(name = "airplane_name")
    private String name;
	@Column(name = "airplane_cost")
	private int cost;
	@Column(name = "airplane_type")
    private String type;
	@Column(name = "airplane_country")
    private String country;

}
