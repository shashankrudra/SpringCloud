package com.walmart.ecommerce;

import com.walmart.ecommerce.entity.Product;
import com.walmart.ecommerce.service.ProductService;
import com.walmart.ecommerce.service.impl.ProductServiceImpl;

public class Appplication {

	public static void main(String[] args) {
		ProductService service = new ProductServiceImpl();
		Product p = new Product();
		p.setId(1);
		p.setName("Laptop");
		p.setPrice(100);
		service.registerProduct(p);
	}

}
