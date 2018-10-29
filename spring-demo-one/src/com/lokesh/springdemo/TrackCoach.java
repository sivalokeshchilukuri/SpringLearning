package com.lokesh.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		super();
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "spend 10min daily on running";
	}

	@Override
	public String getDailyFortune() {
		
		return "From Track Coach "+fortuneService.getFortune();
	}

	
	//Init method--Custom code during bean life cycle
	public void initTrack() {
		System.out.println("Inside init track method");
	}
	
	
	//Destroy method--Custom code during bean life cycle
	public void destroyTrack() {
		System.out.println("Inside destroy track method");
	}

}
