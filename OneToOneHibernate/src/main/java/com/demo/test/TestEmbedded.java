package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Student;
import com.demo.beans.StudentAddress;



public class TestEmbedded {

	public static void main(String[] args) {
//		SessionFactory sf = new Configuration().configure().buildSessionFactory();
//		Session ss = sf.openSession();
//		Transaction tr = ss.beginTransaction();
//		StudentAddress saddr = new StudentAddress(15,"gokhale nager","Pune");
//		Student s = new Student(1, "Suyog", saddr);
//		ss.save(saddr);
//		ss.save(s);
//		tr.commit();
//		ss.close();
//		sf.close();
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		StudentAddress saddr = ss.get(StudentAddress.class,15);
		Student s = ss.get(Student.class, 1);
		System.out.println(s);
		System.out.println(saddr);
		tr.commit();
		ss.close();
		sf.close();
		

		
	}

}
