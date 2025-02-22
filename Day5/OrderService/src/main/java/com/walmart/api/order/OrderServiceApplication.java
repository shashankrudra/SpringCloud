package com.walmart.api.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import com.walmart.api.order.rest.request.NotificationRequest;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(OrderServiceApplication.class, args);
		JmsTemplate template = ctx.getBean(JmsTemplate.class);
		//template.convertAndSend("email_queue", "Send an email to");
		
		NotificationRequest nrq = new NotificationRequest();
		nrq.setId("1");	
		nrq.setMessage("Order is placed");
		nrq.setTo("Customer1");
		template.convertAndSend("email_queue", nrq);
	}

}
