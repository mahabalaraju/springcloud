package com.raj.microservices.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties("raj")
public class PropertyAccessbeans {

	private String name;
	private String address;
	private int mobileNo;
}
