package com.udemy.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	public TrackCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5km";
	}

	@Override
	public String getDailyFortune() {
		return "Track coach says: " + fortuneService.getFortune();
	}
	
	// add init method
	public void initMethodDemo() {
		System.out.println("TrackCoach: inside init method");
	}
	
	// add destroy method
	public void cleanupMethodDemo() {
		System.out.println("TrackCoach: inside destroy method");
	}
}
