package com.demo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao{
	public static SessionFactory sf;
	static
	{
		sf=HibernateUtil.getMySessionFactory();
	}
	
	
	public void save(Product p)
	{
		Session ss= sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.save(p);
		tr.commit();
		ss.close();
	}
	
	public boolean deleteById(int id)
	{
		Session ss= sf.openSession();
		Transaction tr = ss.beginTransaction();
		Product p = ss.get(Product.class, id);
		
		if(p!=null)
		{
			ss.delete(p);
			tr.commit();
			ss.close();
			return true;
		}
//		tr.commit();
		ss.close();
		return false;
	}
	
	public List<Product> getAllProduct()
	{	
		Session ss= sf.openSession();
		Transaction tr = ss.beginTransaction();
		Query query = ss.createQuery("from Product");
		List<Product> plist = query.list();
		tr.commit();
		ss.close();
		return plist;	
	}
	
	public Product displayById(int id) {
		Session ss= sf.openSession();
		Transaction tr = ss.beginTransaction();
		Product p = ss.get(Product.class, id);
		tr.commit();
		ss.close();
		return p;
	}
	
	public List<Product> sortById(){
		Session ss= sf.openSession();
		Transaction tr = ss.beginTransaction();
		Query query = ss.createQuery("from Product p order by p.pid desc");
		List<Product> plist = query.list();
		tr.commit();
		ss.close();
		return plist;
	}
	
	public boolean updateProduct(int pid, String pname, String wname) {
		Session ss= sf.openSession();
		Transaction tr = ss.beginTransaction();
		Product p = ss.get(Product.class, pid);
		if(p!=null)
		{
			p.setPname(pname);
			p.getW().setWname(wname);
			ss.update(p);
			tr.commit();
			ss.close();
			return true;
		}
//		tr.commit();
		ss.close();
		return false;
	}
	
	
	public void closeConnection()
	{
		HibernateUtil.closeMySessionFactory();
	}

}
