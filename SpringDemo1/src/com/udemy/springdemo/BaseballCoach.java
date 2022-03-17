package com.udemy.springdemo;

public class BaseballCoach implements Coach{

	//define a private field
	private FortuneService fortuneService;
	
	//define constructor for DI
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "30min of baseball practice";
	}

	@Override
	public String getDailyFortune() {
		//use fortuneservice to get a fortune
		return fortuneService.getFortune();
	}
}
	