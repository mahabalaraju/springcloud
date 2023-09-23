package com.raj.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.raj.Events.metasploit;

@Component
public class rajulistener {


	public void watchmetasploit(String epNum) {
		System.out.println("raju joined the session:"+"\n started watching metasploit:"+epNum);
	}
	@EventListener
	public void onApplicationEvent(metasploit event) {
		watchmetasploit(event.getEpNum());		
	}

}
