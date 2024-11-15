package com.walmart.email.service;

import com.walmart.email.entity.Email;

public interface EmailService {

	String sendEmail(Email msg);
}
