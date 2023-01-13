package com.xworkz.springg.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springg.bean.Actor;
import com.xworkz.springg.configure.ActorConfigure;

public class ActorTester {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(ActorConfigure.class);
		
		Actor actt = spring.getBean("getActores",Actor.class);
		System.out.println(actt.getName());
		System.out.println(actt.getLanguage());
		System.out.println(actt.getAge());
		
		Actor actt1 = spring.getBean("getActoress",Actor.class);
		System.out.println(actt1.getName());
		System.out.println(actt1.getLanguage());
		System.out.println(actt1.getAge());

	}

}
