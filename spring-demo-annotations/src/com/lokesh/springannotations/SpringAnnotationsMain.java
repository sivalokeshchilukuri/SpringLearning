package com.lokesh.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationsMain {

	public static void main(String[] args) {

		// Load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"springdemoAnnotations-applicationContext.xml");

		CricketCoach coach = context.getBean("theCricketCoach", CricketCoach.class);//cricketCoach default bean id
		System.out.println(coach.getDailyWorkout());

		context.close();
	}

}
