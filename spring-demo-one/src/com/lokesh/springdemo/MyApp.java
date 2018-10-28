package com.lokesh.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//regular java code
		/*BaseballCoach ballcoach =new BaseballCoach();
		System.out.println(ballcoach.getDailyWorkout());*/ 
		
		//using standard interace implementation
		//Coach coach=new BaseballCoach();
		//System.out.println(coach.getDailyWorkout());
		
		//This this is hardcoded--Need to overcome this using Spring approach
		/*Coach coach=new TrackCoach();
		System.out.println(coach.getDailyWorkout());
		coach=new BaseballCoach();
		System.out.println(coach.getDailyWorkout());*/
		
		
		//need to ask object factory to give the objects instead of creating on your own
		//that object factory is given by spring container
		

	}

}
