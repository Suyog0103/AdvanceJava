package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;
import com.demo.beans.Person;
import com.demo.beans.Student;

public class Test_Show {
	public static void main(String[] args) {
	SessionFactory sf =new Configuration().configure().buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();
	Person ee= ss.get(Employee.class,11);
	Person st = ss.get(Student.class,12);
	System.out.println(ee);
	System.out.println(st);
	tr.commit();
	ss.close();
	sf.close();
	}
	
}