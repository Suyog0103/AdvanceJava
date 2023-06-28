package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.MyUser;

public class TestAnnotation {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
//		Session ss =sf.openSession();
//		Transaction tr = ss.beginTransaction();
//		MyUser u1 = new MyUser("suyog","deshmukh@gmail.com");
//		ss.save(u1);
//		tr.commit();
//		ss.close();
//		sf.close();
		
		Session ss =sf.openSession();
		Transaction tr = ss.beginTransaction();
		MyUser u1 = ss.get(MyUser.class,1);
		System.out.println(u1);
		tr.commit();
		ss.close();
		sf.close();

	}

}
