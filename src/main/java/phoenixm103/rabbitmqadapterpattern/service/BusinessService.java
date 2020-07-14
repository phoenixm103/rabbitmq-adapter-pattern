package phoenixm103.rabbitmqadapterpattern.service;


import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import phoenixm103.rabbitmqadapterpattern.adaptee.RabbitMQAdaptee;
import phoenixm103.rabbitmqadapterpattern.adapter.RabbitMQAdapter;
import phoenixm103.rabbitmqadapterpattern.target.RabbitMQTarget;

@Service
public class BusinessService {
	 

	    
	 private RabbitTemplate rabbitTemplate;
	    
	 private Exchange eventExchange;
	 
	 public BusinessService(RabbitTemplate rabbitTemplate, Exchange eventExchange) {
		super();
		this.rabbitTemplate = rabbitTemplate;
		this.eventExchange = eventExchange;
	}

	public void publishMessage(String message) {
		
		RabbitMQTarget rabbitmqtarget=new RabbitMQAdapter(new RabbitMQAdaptee());
		rabbitmqtarget.request(message,rabbitTemplate);
		
		System.out.println("SERVICE SAYS "+message);
		
	}

}

