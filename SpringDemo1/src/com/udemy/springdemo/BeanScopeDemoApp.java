package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean from container
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		Coach betaCoach = context.getBean("myCoach", Coach.class);

		boolean obj = (alphaCoach == betaCoach);
		
		System.out.println(obj);
		System.out.println(alphaCoach);
		System.out.println(betaCoach);
		
		// close context
		context.close();
	}
}
