package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myKabaddiCoach", KabaddiCoach.class);
		Coach theNewCoach = context.getBean("myKabaddiCoach", KabaddiCoach.class);
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theNewCoach.getDailyWorkout());
		
		context.close();
	}
}
