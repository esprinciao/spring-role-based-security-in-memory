package com.iiht.springsecurity.securityfeignservice;

import java.util.List;

import com.iiht.springsecurity.securityfeignmodel.Product;

public interface ProductService {

	List<Product> findAll();

	List<Product> findByCategory(String category);

	Product findById(int id);
	
	

}
