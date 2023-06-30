package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	void closeConnection();

	void save(Product p);

	List<Product> getAllProduct();

	Product displayById(int id);

	boolean deleteById(int id);

	List<Product> sortById();

	boolean updateProduct(int pid, String pname, String wname);

}
