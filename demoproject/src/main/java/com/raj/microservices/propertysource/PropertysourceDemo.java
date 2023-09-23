package com.raj.microservices.propertysource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class PropertysourceDemo {
	@Value("${gmail.host}")
	private String host;
	@Value("${gmail.email}")
	private String email;
	@Value("${gmail.password}")
	private String password;
	
	@Value("${app.name}")
	private String name;
	@Value("${app.madeBy}")
	private String madeby;
	@Value("${app.madeIn}")
	private String madein;
	
	
}
