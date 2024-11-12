package com.walmart.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.walmart.ecommerce.entity.Product;
import com.walmart.ecommerce.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductService service = context.getBean(ProductService.class);
		Product p = new Product();
		p.setId(1);
		p.setName("Laptop");
		p.setPrice(100);
		service.registerProduct(p);
	}

}
