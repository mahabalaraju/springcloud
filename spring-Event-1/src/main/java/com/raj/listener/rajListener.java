package com.raj.listener;

import org.springframework.stereotype.Component;

@Component
public class rajListener {
 public void watching(String sessionNo) {
	 System.out.println("raj listener started watching hacker loi");
	 System.out.print("watching class:" +sessionNo);
	 
 }
}
