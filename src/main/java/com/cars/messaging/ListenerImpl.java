package com.cars.messaging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ListenerImpl {

	static Log logger = LogFactory.getLog(ListenerImpl.class);
	
	public void listen(byte[] message) {	
		logger.info("listener(byte[]):  " + message.toString());
	}
	
	public void listen(String message) {	
		logger.info("listener(String):  " + message);
	}

}
