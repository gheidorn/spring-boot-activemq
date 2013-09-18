package com.cars.messaging;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProducerController {
	
	static Log logger = LogFactory.getLog(ProducerController.class);
	
	static String mailboxDestination = "mailbox-destination";
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	@RequestMapping("/send")
	public String send() {
		logger.info("entering send()");
				
		MessageCreator messageCreator = new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage("ping!");
            }
        };
        
        logger.info("Sending a new TextMessage to [" + mailboxDestination + "]");
        jmsTemplate.send(mailboxDestination, messageCreator);
		
		return "producer";
	}
}
