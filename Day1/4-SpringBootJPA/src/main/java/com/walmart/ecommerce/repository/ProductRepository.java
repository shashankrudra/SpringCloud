package com.walmart.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walmart.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	Product save(Product p);
}
