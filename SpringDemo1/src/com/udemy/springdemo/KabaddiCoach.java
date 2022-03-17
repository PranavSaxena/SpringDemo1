package com.udemy.springdemo;

public class KabaddiCoach implements Coach {

	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("inside setFortuneSerive");
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Raiding practice for 30min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void startupMethod() {
		System.out.println("KabaddiCoach: inside startupMethod");
	}
	
	public void cleanupMethod() {
		System.out.println("KabaddiCoach: inside cleanupMethod");
	}
}
