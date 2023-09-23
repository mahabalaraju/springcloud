package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class IntegrationDemoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(IntegrationDemoApplication.class, args);
	}

}
