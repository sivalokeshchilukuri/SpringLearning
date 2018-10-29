package com.lokesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach coach = context.getBean("myTrackCoach",Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		context.close();

		
	}

}
