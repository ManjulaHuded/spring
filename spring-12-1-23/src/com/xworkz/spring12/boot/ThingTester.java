package com.xworkz.spring12.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring12.auto.Engine;
import com.xworkz.spring12.auto.Ghost;
import com.xworkz.spring12.auto.NewsPaper;
import com.xworkz.spring12.auto.Snake;
import com.xworkz.spring12.configuration.ThingConfiguration;

public class ThingTester {

	public static void main(String[] args) {
		ApplicationContext container = 
	new AnnotationConfigApplicationContext(ThingConfiguration.class);

		NewsPaper refOfNews = container.getBean(NewsPaper.class);
		System.out.println(refOfNews);
		
		Engine refOfEngine = container.getBean(Engine.class);
		System.out.println(refOfEngine);
		
		Snake refOfSnake = container.getBean(Snake.class);
		System.out.println(refOfSnake);
		
		Ghost refOfGhost = container.getBean(Ghost.class);
		System.out.println(refOfGhost);

	}

}
