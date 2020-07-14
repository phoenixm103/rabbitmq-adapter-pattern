package phoenixm103.rabbitmqadapterpattern.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import phoenixm103.rabbitmqadapterpattern.service.BusinessService;


@RestController
public class BusinessController {

	private BusinessService businessService;
	
	public BusinessController(BusinessService businessService) {
	super();
	this.businessService = businessService;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/publishmessages")
	public void publishMessage(@RequestParam String message) {
		
		businessService.publishMessage(message);
	
	}

}
