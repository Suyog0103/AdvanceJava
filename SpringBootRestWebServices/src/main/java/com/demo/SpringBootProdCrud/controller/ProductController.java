package com.demo.SpringBootProdCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBootProdCrud.beans.Product;
import com.demo.SpringBootProdCrud.service.ProductService;

@RestController
public class ProductController {
@Autowired
	ProductService pservice;

@GetMapping("/viewproduct")
	public List<Product> getAllProduct()
	{
		List<Product> plist=pservice.getAllProducts();
		return plist;
	}


@PostMapping("/product/{pid}")
public ResponseEntity<String> insertProduct(@RequestBody Product p) {
	
	pservice.addProduct(p);
	  return ResponseEntity.ok("Added successfully");
}




@GetMapping("/product/{pid}")
public ResponseEntity<Product> getById(@PathVariable int pid) {
	Product p=pservice.getById(pid);
	if(p!=null) {
		return ResponseEntity.ok(p);
	}
	return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	
}

@PutMapping("/product/{pid}")
public ResponseEntity<String> updateProduct(@RequestBody Product p) {
	
	pservice.updateProduct(p);
	return ResponseEntity.ok("modified successfully");
}

@DeleteMapping("/product/{pid}")
public ResponseEntity<String> deleteProduct(@PathVariable int pid) {
	pservice.deleteById(pid);
	
	return ResponseEntity.ok("deleted successfully");	
}
	
	
}
