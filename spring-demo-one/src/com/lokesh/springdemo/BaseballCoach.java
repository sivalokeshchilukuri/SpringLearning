package com.lokesh.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		super();
	}

	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		
		fortuneService=theFortuneService;
		
	}

	@Override
	public String getDailyWorkout() {
		
		return "spend 10min daily on batting practice";

	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
