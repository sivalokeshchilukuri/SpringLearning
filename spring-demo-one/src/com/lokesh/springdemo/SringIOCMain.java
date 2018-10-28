package com.lokesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SringIOCMain {

	public static void main(String[] args) {
		
		//Load the Spring configuration file
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//load the bean from container
		/*Coach coach=(Coach) context.getBean("myTrackCoach");
		System.out.println(coach.getDailyWorkout());*/
		
		Coach coach= context.getBean("myTrackCoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		
		coach=context.getBean("myBaseballCoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		
		context.close();

	}

}
