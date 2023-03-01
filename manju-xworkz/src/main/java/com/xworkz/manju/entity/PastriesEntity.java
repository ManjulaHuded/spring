package com.xworkz.manju.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pastries_table")
@NamedQuery(name = "findByColor",query = "select entity from PastriesEntity entity where entity.color=:col")
public class PastriesEntity {
	@Id
	@Column(name = "p_id")
	private int id;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_price")
	private int price;
	@Column(name = "p_flavour")
	private String flavour;
	@Column(name = "p_type")
	private String type;
	@Column(name = "p_color")
	private String color;

}
