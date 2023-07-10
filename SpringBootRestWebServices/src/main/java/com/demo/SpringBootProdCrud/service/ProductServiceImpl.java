package com.demo.SpringBootProdCrud.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootProdCrud.beans.Product;
import com.demo.SpringBootProdCrud.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
@Autowired
	ProductDao pdao;

	public List<Product> getAllProducts()
	{
		List<Product> plist = pdao.findAll();
		System.out.println(plist);
		return plist;
	}

	@Override
	public Product getById(int pid) {
		Optional<Product> ob = pdao.findById(pid);
		if(ob.isPresent())
			return ob.get();
		return null;
	}

	@Override
	public void addProduct(Product p) {
		
		pdao.save(p);
		
		
	}

	@Override
	public void updateProduct(Product p) {
		Optional<Product> op=pdao.findById(p.getPid());
		if(op.isPresent()) {
			
			pdao.save(p);
		}
	}
	
	public void deleteById(int pid) {
		pdao.deleteById(pid);
		
	}
	
	public List<Product> getByPrice(int lpr, int hpr) {
		List<Product> plist=pdao.getByPrice(lpr,hpr);
		System.out.println(plist);
		return plist;
	}
	

}
