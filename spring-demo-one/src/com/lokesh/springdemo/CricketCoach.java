package com.lokesh.springdemo;

public class CricketCoach implements Coach {
	
	
	//Introducing setter Injection
	private FortuneService fortuneService;
	
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
		
		return fortuneService.getFortune() + " from Cricket coach";
	}

}
