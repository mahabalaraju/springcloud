package com.raj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.raj.Service.userService;

@Controller
public class controller {

	@Autowired
	private userService service;
	
		@GetMapping("/users")
		public ResponseEntity<String> getuserid(@RequestParam(name="Username" ,required=false, defaultValue = "raj") String name){
			String body=service.getUserIdByUsername(name);
			return ResponseEntity .status(HttpStatus.OK).body(body);
		}
}
