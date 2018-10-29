package com.lokesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach coach = context.getBean("myBaseballCoach",Coach.class);
		
		System.out.println(coach);
		
		Coach alphaCoach = context.getBean("myBaseballCoach",Coach.class);
		
		System.out.println(alphaCoach);
		//com.lokesh.springdemo.BaseballCoach@5e853265 
		//both the coach and alpha coach will throw same results as the scope is singleton by default
		//if we chanage to prototype in applicationContext xml file then it will create separate objects

		
		context.close();

		
	}

}
