package com.walmart.ecommerce.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class HelloRestController {

	@Autowired
	private Environment env;
	
	@Value("${coupon_type}")
	private String type;
	
	@Value("${company}")
	private String organization;
	
	@GetMapping("/hello")
	public String SayHello() {
		return "Hello World! " + env.getProperty("local.server.port") 
		+ " Company is " + organization
		+ " Coupon Type " + type;
	}
	
}
