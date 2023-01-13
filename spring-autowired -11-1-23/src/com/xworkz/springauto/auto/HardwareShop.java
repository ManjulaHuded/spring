package com.xworkz.springauto.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
    @Autowired
    @Qualifier("name")
	private String name;
    @Autowired
    @Qualifier("ownerName")
	private String ownerName;
    @Autowired
    @Qualifier("address")
	private String address;
    @Autowired
	private int id;
    @Autowired
	private String gstNo;
	
	public HardwareShop() {
		System.out.println("hardware shop object is created");
		
	}

	@Override
	public String toString() {
		return "HardwareShop [name=" + name + ", ownerName=" + ownerName + ", address=" + address + ", id=" + id
				+ ", gstNo=" + gstNo + "]";
	}
	
	
}
