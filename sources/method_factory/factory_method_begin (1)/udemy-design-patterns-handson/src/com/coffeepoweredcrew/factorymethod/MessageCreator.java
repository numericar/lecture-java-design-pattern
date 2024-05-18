package com.coffeepoweredcrew.factorymethod;

import com.coffeepoweredcrew.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

	public Message getMessage() {
		// createMessage จะถูกประมวลผลตาม obj ที่สางคืนมา
		Message msg = createMessage();
		
		msg.addDefaultHeaders();
		msg.encrypt();
		
		return msg;
	}
	
	// factory method
	public abstract  Message createMessage();
	
}
