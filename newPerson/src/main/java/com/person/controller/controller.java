package com.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.person.entity.entity;
import com.person.service.PersonService;

@RestController
public class controller {
	@Autowired
	private PersonService ser;

	@GetMapping("/")
	public ResponseEntity<List<entity>> getall() {
		// List<entity> list= ser.getall();
		return new ResponseEntity(ser.getall(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<entity> getbyid(@PathVariable int id){
		return ResponseEntity.ok(ser.getbyid(id));
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody entity person) {
		return ResponseEntity.ok(ser.upsert(person));
	}

	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody entity person ) {
		return ResponseEntity.ok(ser.upsert(person));
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		String res=ser.delete(id);
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}
	@PutMapping("/updates/{id}")
	public ResponseEntity<String> update(@RequestBody entity person ,@PathVariable int id) {
		entity per=ser.getbyid(id);
		String s=ser.update(per);
		return ResponseEntity.ok(s);
	}
	
}
