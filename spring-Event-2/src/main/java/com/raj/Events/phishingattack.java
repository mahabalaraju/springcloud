package com.raj.Events;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Component
public class phishingattack extends ApplicationEvent {
	private String sessionId;

	public phishingattack(Object source, String sessionId) {
		super(source);
		this.sessionId = sessionId;
	}


	public String getsessionNo() {
		return sessionId;
	}

}
