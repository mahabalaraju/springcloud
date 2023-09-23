package com.raj.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.raj.Events.metasploit;
import com.raj.Events.phishingattack;
import com.raj.publisher.mahabala;

@Component
public class urs implements ApplicationListener<phishingattack> {

	public void watchmetasploit(String sessionId) {
		System.out.println("urs joined the session:" + "\n started watching metasploit:" + sessionId);
	}

	@Override
	public void onApplicationEvent(phishingattack event) {
	watchmetasploit(event.getsessionNo());
	}

}
