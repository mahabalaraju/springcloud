package com.raj.microservices.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@Autowired
	private PropertyAccessbeans bean;
	
	@GetMapping("/hi") 
	public String asdf() {
		return bean.getAddress()+bean.getName()+bean.getMobileNo();
	}
}
