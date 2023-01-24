package com.ex;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		
		cf.configure("hibernate.xml");
		SessionFactory sf=cf.buildSessionFactory(); 
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		
		College siddhu=new College(); 
		siddhu.setSt_id(678);
		siddhu.setS_name("Siddhu");
		siddhu.setS_marks(240);
		siddhu.setSection("A");
		siddhu.setBranch("CSE");
		
		se.save(siddhu); 
		tx.commit(); 
		
	}

}