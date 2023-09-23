package com.raj.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class RajSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RajSpringCloudConfigServerApplication.class, args);
	}

}
