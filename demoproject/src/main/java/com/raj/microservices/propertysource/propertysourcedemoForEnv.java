package com.raj.microservices.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
@Component
public class propertysourcedemoForEnv {
@Autowired
private Environment env; 	

	private String name;
	private String address;
	private String mobileNo;
	public String getName() {
		return env.getProperty("raj.name");
	}
	
	public String getAddress() {
		return env.getProperty("raj.address");
	}
	
	public String getMobileNo() {
		return env.getProperty("raj.mobileNo");
	}
	
	
}
