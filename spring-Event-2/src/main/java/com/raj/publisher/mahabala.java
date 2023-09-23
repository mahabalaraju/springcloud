package com.raj.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class mahabala {

	@Autowired
	ApplicationEventPublisher applicationeventpublisher;
	
	public void metasploit(String epNum) {
		System.out.println("mahabala publishing an metasploit event with episode number:"+epNum);
	applicationeventpublisher.publishEvent(new com.raj.Events.metasploit(epNum));
	}
	public void phishingattack(String sessionId) {
		System.out.println("mahabala publishing an metasploit event with episode number:"+sessionId);
	applicationeventpublisher.publishEvent(new com.raj.Events.phishingattack(this,sessionId));
	}
}
