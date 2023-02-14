package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootEx {
	public static void main(String[] args) {
		ConfigurableApplicationContext ca=SpringApplication.run(SpringBootEx.class, args);
		College c=new College();
		c.setSt_id(1037);
//		c.setS_name("Siddha");
//		c.setS_marks(654);
//		c.setSection("B");
//		c.setBranch("It");
	
		CollegeDao d=ca.getBean(CollegeDao.class);
		d.insert(c);
		
		}

}