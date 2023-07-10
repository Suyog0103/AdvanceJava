package com.demo.SpringBootProdCrud.service;

import java.util.List;

import javax.validation.Valid;

import com.demo.SpringBootProdCrud.beans.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product getById(int pid);

	void addProduct(Product p);

	void updateProduct(@Valid Product p);

	void deleteById(int pid);

	List<Product> getByPrice(int lpr, int hpr);



}
