package com.walmart.notification.service.impl;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import com.walmart.api.order.rest.request.NotificationRequest;

@Service
public class NotificationServiceImpl {
	
	@JmsListener(destination="email_queue")
	public void processNotification(NotificationRequest nrq) {
		String msg = nrq.getMessage();
		System.out.println(msg);
	}
}
