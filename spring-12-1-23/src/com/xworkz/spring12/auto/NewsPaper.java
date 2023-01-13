package com.xworkz.spring12.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired
	@Qualifier("newsPaperId")
	private int id;
	private String name;
	private String ownerName;
	@Autowired
	@Qualifier("language")
	private String language;
	private double price;
	
	public NewsPaper(@Qualifier("newsPaperName") String name,@Qualifier("ownerName") String ownerName) {
		this.name = name;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}
	
	public double getPrice() {
		return price;
	}
	
	@Autowired
	@Qualifier("newsPaperPrice")
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
