package com.lokesh.springannotations;

import org.springframework.stereotype.Controller;

@Controller("theCricketCoach")
//if we dont specify te bean id spring will create starting with lower case like: cricketCoach from class name
public class CricketCoach {

	public CricketCoach() {
		System.out.println("Inside cricket coach Constructor");
	}
	
	public String getDailyWorkout() {
		
		return "Get some Cricket Batting Practice";
	}


}
