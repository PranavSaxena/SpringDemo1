package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		
		//load the config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retreive the bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
	
}
