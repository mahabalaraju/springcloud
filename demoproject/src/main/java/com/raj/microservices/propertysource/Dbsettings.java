package com.raj.microservices.propertysource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties("db")
@Data
public class Dbsettings {

	
	private String connection;
	private String host;
	private int port;
}
