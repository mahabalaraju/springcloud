package com.raj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	private static final Logger log = LoggerFactory.getLogger(controller.class);

	@GetMapping("/something")
	public  ResponseEntity<String> createlogs(){
		log.warn("just checking");
		return ResponseEntity.ok().body("all ok");
	}
	
 
}
