package com.ex;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {
	
	public static void main(String[] args) { 
		Configuration cf=new Configuration(); 
		cf.configure("hibernate.xml"); 
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Student ramya=new Student(); 
		ramya.setSid(111);
		ramya.setSname("ramya");
		ramya.setSmarks(567);
		Address a =new Address(); 
		a.setAid(101);
		a.setPlace("Banglore");
		a.setSt(ramya);
		
		se.save(a);
		tx.commit(); 
	}

}