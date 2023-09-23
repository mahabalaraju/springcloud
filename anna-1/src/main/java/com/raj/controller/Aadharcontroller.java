package com.raj.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.raj.entityy.Aadhardetails;
import com.raj.service.Aadharservice;
@RestController
public class Aadharcontroller {
	@Autowired
	Aadharservice adharService;

	@GetMapping("/aadhar")
	public ResponseEntity<Object> fetchAdhar(@RequestParam("name") String name) {

	return ResponseEntity.status(HttpStatus.OK).body(adharService.fetchAdharById(name));

	}
}