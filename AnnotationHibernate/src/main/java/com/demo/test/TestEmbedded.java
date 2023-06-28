package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Product;
import com.demo.beans.Warehouse;

public class TestEmbedded {

	public static void main(String[] args) {
//		SessionFactory sf = new Configuration().configure().buildSessionFactory();
//		Session ss = sf.openSession();
//		Transaction tr = ss.beginTransaction();
//		Warehouse wh = new Warehouse(12,"lalaland");
//		Product pp = new Product(1, "chips", wh);
//		ss.save(pp);
//		tr.commit();
//		ss.close();
//		sf.close();
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr=ss.beginTransaction();
		Product pp = ss.get(Product.class, 1);
		System.out.println(pp);
		tr.commit();
		ss.close();
		sf.close();
		
	}

}
