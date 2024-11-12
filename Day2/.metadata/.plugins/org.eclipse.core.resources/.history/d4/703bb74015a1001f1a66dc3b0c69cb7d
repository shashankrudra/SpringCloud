package com.walmart.ecommerce.service.impl;

import com.walmart.ecommerce.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.ecommerce.entity.Product;
import com.walmart.ecommerce.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public Product registerProduct(Product p) {
		repo.save(p);
		return null;
	}

	@Override
	public Product findProduct(int id) {
		
		Product p = repo.findById(id).get();
		return p;
	}

}
