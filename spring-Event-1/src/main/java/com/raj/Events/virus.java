package com.raj.Events;

import org.springframework.context.ApplicationEvent;

public class virus extends ApplicationEvent{

	String sessionNo;
	public virus(Object source) {
		super(source);
		}

	public virus(Object source, String SessionNo) {
		super(source);
		this.sessionNo=SessionNo;
	}
	public String getSessionNo() {
		return sessionNo; 
	}
}
