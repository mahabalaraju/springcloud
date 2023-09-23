package com.champion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.champion.Repo.personRepo;
import com.champion.Service.personService;
import com.champion.entity.person;

@RestController
@RequestMapping("/api/person")
public class NewController {

	@Autowired
	private personService ser;

	@GetMapping
	public ResponseEntity<List<person>> getallusers() {
		return ResponseEntity.ok(ser.getall());
	}

	@PostMapping
	public ResponseEntity<String> addUsers(@RequestBody person per) {
		return new ResponseEntity<String>(ser.add(per), HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateusers(@PathVariable int id, @RequestBody person per) {
     return ResponseEntity.ok(ser.update(per));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletebyid(@PathVariable int id){
		return ResponseEntity.ok(ser.delete(id));
	}
	@GetMapping("/{name}")
	public ResponseEntity<String> findbyname(@PathVariable String name){
		return new ResponseEntity(ser.findByName(name),HttpStatus.OK);
	}
	@GetMapping("/id/{id}")
	public ResponseEntity<Optional<person>> findbyidEntity(@PathVariable int id){
		return ResponseEntity.status(HttpStatus.OK).body(ser.getbyid(id));
	}
}
