package com.lokesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SringIOCMain {

	public static void main(String[] args) {
		
		//Load the Spring configuration file
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//load the bean from container
		/*Coach coach=(Coach) context.getBean("myTrackCoach");
		System.out.println(coach.getDailyWorkout());*/
		
		//For the Constructor Dependency Injection
		Coach coach= context.getBean("myTrackCoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		//For the Constructor Dependency Injection
		coach=context.getBean("myBaseballCoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		
		//For the Setter Dependency Injection
		coach=context.getBean("myCricketCoach",Coach.class);
		System.out.println(coach.getDailyFortune());
		
		
		context.close();

	}

}
