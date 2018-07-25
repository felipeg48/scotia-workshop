package com.scotia.demo.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private Logger log = LoggerFactory.getLogger(HelloWorldController.class);

	@Autowired
	ScotiaProperties props;

	@RequestMapping("/hello")
	public String hello() {
		log.debug(">>>> This is just a message....");
		return "Hello " + props.getMsg();
	}

	@RequestMapping("/props")
	public ScotiaProperties properties() {
		return props;
	}

}
