package com.lokesh.springdemo;

public class CricketCoach implements Coach {
	
	
	//Introducing setter Injection
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public CricketCoach() {
		System.out.println("Inside cricket coach Constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside cricket coach setter method");
		this.fortuneService=fortuneService;
	}
	
	public String getFortuneService() {
		
		return fortuneService.getFortune();
		
	}

	@Override
	public String getDailyWorkout() {
		
		return "Get some Cricket Batting Practice";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune() + " from Cricket coach "+"\nEmail:"+ getEmailAddress()+"\nTeam: "+getTeam();
	}

}
