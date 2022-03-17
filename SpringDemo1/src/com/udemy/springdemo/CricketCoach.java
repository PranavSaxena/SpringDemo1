package com.udemy.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;

	// new fields for literal injection
	private String emailAddress;
	private String team;


	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method for setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method for setTeam");
		this.team = team;
	}

	//create no-arg const
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-args const.");
	}

	@Override
	public String getDailyWorkout() {
		return "Fielding fast bowling for 30mins";
	}

	//create setter method for injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method for setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}	
}
