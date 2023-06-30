package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;
import com.demo.beans.Student;

public class Test_add {

	public static void main(String[] args) {
		SessionFactory sf =new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
//		Employee ee= new Employee(1, "Ashish","Belgaum","Hr","manager");
		Student st = new Student(3,"Suyog","Chh SambhajiNager","Dac",500);
//		ss.save(ee);
		ss.save(st);
		tr.commit();
		ss.close();
		sf.close();
	}

}
