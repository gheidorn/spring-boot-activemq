package com.cars.messaging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	static Log logger = LogFactory.getLog(HomeController.class);
	
	@RequestMapping("/")
	public String home() {
		logger.info("entering home()");
		return "home";
	}
}
