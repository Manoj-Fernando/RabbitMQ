/**
 * 
 */
package com.rabbitmq.producer.source.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.producer.source.model.Customer;
import com.rabbitmq.producer.source.service.RabbitMQPublisher;

/**
 * @author Manoj Fernando A
 *
 */
@RestController
@RequestMapping("/api")
public class BaseController {
	
	@Autowired
	RabbitMQPublisher service;

	@RequestMapping("/publishMessage")
	public String publishMessage(@RequestBody Customer customer) {
		service.send(customer);
		return "Message(Request) is added to the queue successfully";
	}
}
