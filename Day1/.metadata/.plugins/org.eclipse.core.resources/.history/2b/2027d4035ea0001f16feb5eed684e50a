package com.walmart.ecommerce.service.impl;

import com.walmart.ecommerce.service.ProductService;

import com.walmart.ecommerce.entity.Product;
import com.walmart.ecommerce.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	
	private ProductRepository repo;

	@Override
	public Product registerProduct(Product p) {
		repo.save(p);
		return null;
	}

}
