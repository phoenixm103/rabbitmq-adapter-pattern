package phoenixm103.rabbitmqadapterpattern.adaptee;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import phoenixm103.rabbitmqadapterpattern.config.EventProducerConfiguration;

@Service
public class RabbitMQAdaptee {
	 
	



	public void specificRequest(String string, RabbitTemplate rabbitTemplate ) {
		
		System.out.println("message "+ string+ " EXCHANGE "+EventProducerConfiguration.exchange+ " Routing key "+ EventProducerConfiguration.routingkey );
		rabbitTemplate.convertAndSend(EventProducerConfiguration.exchange, EventProducerConfiguration.routingkey, string);
		System.out.println("This is an example of Adapter Pattern and the msg is "+ string);
	}



	public RabbitMQAdaptee() {
		super();
		
	}

}
