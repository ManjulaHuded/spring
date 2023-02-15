package com.xworkz.egg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "egg_table")
public class EggDTO {

	@Id
	@Column(name = "e_id")
	private int id;
	@Column(name = "egg_hotelName")
	private String hotelName;
	@Column(name = "egg_dishName")
	private String dishName;
	@Column(name = "egg_type")
	private String type;
	@Column(name = "egg_price")
	private int price;
	@Column(name = "egg_quantity")
	private String quantity;
	@Column(name = "egg_takeAway")
	private boolean takeAway;

}
