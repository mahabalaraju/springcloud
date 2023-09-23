package com.raj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZzzApplication {
	
	final static Logger  logger = LoggerFactory.getLogger(ZzzApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ZzzApplication.class, args);
	}

}
