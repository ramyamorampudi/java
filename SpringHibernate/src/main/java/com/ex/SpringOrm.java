package com.ex;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class SpringOrm {
	private SessionFactory sf;
	private Session se;
	private Transaction tx;
	
	public void setsf(SessionFactory sf) {
		this.sf=sf;
	}
	
	public void insert(College c) {
		se=sf.openSession();
		tx=se.beginTransaction();
		se.save(c);
		tx.commit();
	}
	public void select() {
		se=sf.openSession();
		Query qr=se.createQuery("from College c");
		List li=qr.list();
		Iterator i=li.iterator();
		while(i.hasNext()) {
			College c=(College)i.next();
			System.out.println(c.getSt_id()+" "+c.getS_name()+" "+c.getS_marks()+" "+c.getSection()+" "+c.getBranch());
		}
		
	}
		
}