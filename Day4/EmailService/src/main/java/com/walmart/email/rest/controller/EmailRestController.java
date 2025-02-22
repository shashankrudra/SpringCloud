package com.walmart.email.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.email.entity.Email;
import com.walmart.email.service.EmailService;
 

@RestController
public class EmailRestController {
	
	@Autowired
	private EmailService service;
	
	@PostMapping("/email/{msg}")
	public String sendEmail(@PathVariable Email email) {
		
		return service.sendEmail(email);
	}

}
