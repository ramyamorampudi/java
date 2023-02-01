package com.ex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
		Journey c=ac.getBean(Travel.class);
		c.startJourney();
		
	}

}
