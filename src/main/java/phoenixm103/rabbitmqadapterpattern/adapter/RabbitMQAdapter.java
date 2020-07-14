package phoenixm103.rabbitmqadapterpattern.adapter;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import phoenixm103.rabbitmqadapterpattern.adaptee.RabbitMQAdaptee;
import phoenixm103.rabbitmqadapterpattern.target.RabbitMQTarget;

public class RabbitMQAdapter implements RabbitMQTarget{
	
	@Autowired
	private RabbitMQAdaptee rabbitMQAdaptee;
	
	
	public RabbitMQAdapter(RabbitMQAdaptee rabbitMQAdaptee) {
		super();
		this.rabbitMQAdaptee = rabbitMQAdaptee;
	}
	
	@Override
	public void request(String string,RabbitTemplate rabbitTemplate) {
		
		this.rabbitMQAdaptee.specificRequest(string,rabbitTemplate);
	}

	
}
