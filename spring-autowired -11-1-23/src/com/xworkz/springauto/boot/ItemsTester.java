package com.xworkz.springauto.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springauto.auto.HardwareShop;
import com.xworkz.springauto.auto.Pencil;
import com.xworkz.springauto.auto.Rubber;
import com.xworkz.springauto.auto.Software;
import com.xworkz.springauto.auto.SoftwareEngineer;
import com.xworkz.springauto.configuration.ItemsConfiguration;

public class ItemsTester {

	public static void main(String[] args) {

		ApplicationContext container =
				new AnnotationConfigApplicationContext(ItemsConfiguration.class);

		HardwareShop shop = container.getBean(HardwareShop.class);
		System.out.println(shop);

		SoftwareEngineer soft = container.getBean(SoftwareEngineer.class);
		System.out.println(soft.getName());
		System.out.println(soft.getCompanyName());
		System.out.println(soft.getExperience());
		System.out.println(soft.getSalary());

		Software ware = container.getBean(Software.class);
		System.out.println(ware);
		
		Pencil pen = container.getBean(Pencil.class);
		System.out.println(pen);
		
		Rubber rub = container.getBean(Rubber.class);
		System.out.println(rub);

	}
}
