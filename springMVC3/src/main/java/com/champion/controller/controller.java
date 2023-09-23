package com.champion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.champion.Service.personService;
import com.champion.person.person;

@Controller
@RequestMapping("/api")
public class controller {

	@Autowired
	private personService ser;

	@GetMapping("/list")
	public ResponseEntity<List<person>> getall() {
		return ResponseEntity.ok(ser.getall());
				}

	@PostMapping("/saveperson")
	public ResponseEntity<String> save(person per) {
			return new ResponseEntity<String>(ser.upsert(per),HttpStatus.OK);
	}

	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateperson(@RequestBody person per) {
		return new ResponseEntity<String>(ser.upsert(per),HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteperson(@PathVariable int id) {
		return new ResponseEntity<String>(ser.delete(id),HttpStatus.OK);		
	}

}
