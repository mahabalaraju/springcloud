package com.raj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("/hello")
	public String hellp(@RequestParam(name="name",defaultValue = "world")String name) {
		return "hello"+ name;
	}
}
