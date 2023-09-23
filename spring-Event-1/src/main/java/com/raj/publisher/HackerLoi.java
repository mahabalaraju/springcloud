package com.raj.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.raj.listener.rajListener;

@Component
public class HackerLoi {
	@Autowired
	private rajListener listner;
	
public void metasploit(String SessionNo) {
	System.out.println("I'm watching his classes of metasploit :"+SessionNo);
listner.watching(SessionNo);
}

}
