package com.walmart.ecommerce.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRestController {

	@Autowired
	private Environment env;
	
	@Value("${company}")
	private String organization;
	
	@GetMapping("/hello")
	public String SayHello() {
		return "Hello World! " + env.getProperty("local.server.port") + " Company is " + organization;
	}
	
}
