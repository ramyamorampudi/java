package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		SpringOrm s=ac.getBean(SpringOrm.class);
		College c=new College();
		c.setSt_id(1046);
		c.setS_name("Mark");
		c.setS_marks(654);
		c.setSection("A");
		c.setBranch("CSE");
		s.insert(c);
	}

}
