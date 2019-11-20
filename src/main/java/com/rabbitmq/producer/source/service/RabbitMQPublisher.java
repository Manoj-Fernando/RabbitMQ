/**
 * 
 */
package com.rabbitmq.producer.source.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.rabbitmq.producer.source.model.Customer;


/**
 * @author Manoj Fernando A
 *
 */
@Service
public class RabbitMQPublisher {

	@Autowired
	private AmqpTemplate rabbitTemplateObj;
	
	@Value("${code.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${code.rabbitmq.routingkey}")
	private String routingkey;	
	
	public void send(Customer customer) {
		rabbitTemplateObj.convertAndSend(exchange, routingkey, customer);
		System.out.println("Send msg = " + customer);
	    
	}
}
