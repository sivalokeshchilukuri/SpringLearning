package com.lokesh.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationsMain {

	public static void main(String[] args) {

		// Load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"springdemoAnnotations-applicationContext.xml");

		// load the bean from container
		/*
		 * Coach coach=(Coach) context.getBean("myTrackCoach");
		 * System.out.println(coach.getDailyWorkout());
		 */

		// For the Constructor Dependency Injection
		CricketCoach coach = context.getBean("theCricketCoach", CricketCoach.class);
		System.out.println(coach.getDailyWorkout());

		context.close();
	}

}
