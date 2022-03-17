package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		// call for literal values
		System.out.println(theCricketCoach.getEmailAddress());
		System.out.println(theCricketCoach.getTeam());
		
		//close the context
		context.close();
	}
	
}
