package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.beans.WareHouse;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
	public static ProductDao pdao;
	
	public ProductServiceImpl()
	{
		pdao = new ProductDaoImpl();
	}
	
	
	public void addNewProdut()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product");
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter pname");
		String pname=sc.next();
		System.out.println("enter wid");
		int wid=sc.nextInt();
		System.out.println("enter wname");
		String wname=sc.next();
		System.out.println("enter warehouse location");
		String wloc=sc.next();
		WareHouse w = new WareHouse(wid,wname,wloc);
		Product p = new Product(pid, pname, w);
		pdao.save(p);
	}
	
	public List<Product> getAllProduct()
	{
		return pdao.getAllProduct();
	}
	
	public Product displayById(int id)
	{
		return pdao.displayById(id);
	}
	
	public boolean deleteById(int id)
	{
		return pdao.deleteById(id);
	}
	
	public List<Product> sortById()
	{
		return pdao.sortById();
	}
	
	public boolean updateProduct(int pid, String pname, String wname)
	{
		return pdao.updateProduct(pid, pname, wname);
	}
	
	
	
	public void closeConnection()
	{
		pdao.closeConnection();
	}

}
