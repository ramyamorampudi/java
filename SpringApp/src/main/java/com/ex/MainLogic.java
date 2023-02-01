package com.ex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
		College c=ac.getBean(College.class);
		System.out.println(c.getSt_id()+" "+c.getS_name()+" "+c.getS_marks()+" "+c.getSection()+" "+c.getBranch());
		
	}

}
