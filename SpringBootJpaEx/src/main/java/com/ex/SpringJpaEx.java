package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpaEx {

	public static void main(String[] args) {

	ConfigurableApplicationContext ca=SpringApplication.run(SpringJpaEx.class,args);
	CollegeService collegeService=ca.getBean(CollegeService.class);
	//College c=new College();
	//c.setSt_id(1098);
	//c.setS_name("rakesh");
	//c.setS_marks(376);
	//c.setSection("A");
	//c.setBranch("ECE");

	//cs.insert(c);
	//collegeService.delete(1067);
	collegeService.update(421,1037);
	collegeService.select();
	}
}