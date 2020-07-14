package phoenixm103.rabbitmqadapterpattern.target;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

public interface RabbitMQTarget {
	void request(String string, RabbitTemplate rabbitTemplate);
}
