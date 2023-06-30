package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	void closeConnection();

	void addNewProdut();

	List<Product> getAllProduct();

	Product displayById(int id);

	boolean deleteById(int id);

	List<Product> sortById();

	boolean updateProduct(int pid, String pname, String wname);

}
