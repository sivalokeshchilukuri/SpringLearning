package com.lokesh.springannotations;

import org.springframework.stereotype.Controller;

@Controller("theCricketCoach")
public class CricketCoach {

	public CricketCoach() {
		System.out.println("Inside cricket coach Constructor");
	}
	
	public String getDailyWorkout() {
		
		return "Get some Cricket Batting Practice";
	}


}
