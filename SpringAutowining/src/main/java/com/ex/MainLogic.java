package com.ex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
		Categary c=ac.getBean(Categary.class);
		System.out.println("Categary name="+c.getCategary_name());
		Book bk=c.getBk();
		System.out.println("Id="+bk.getBkid()+" "+bk.getBook_name()+" "+bk.getBook_price()+" "+bk.getBook_author());
	}

}
