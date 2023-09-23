package com.raj.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class AaaApplication {

	@GetMapping("/hi")
	public String asf() {
     return "asfasasdfasfa"
   ;
	}

	public static void main(String[] args) {
		SpringApplication.run(AaaApplication.class, args);
	}

}
