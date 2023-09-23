package com.raj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.raj.model.student;
import com.raj.repo.studentRepository;

@RestController
@RequestMapping("/api/students")
public class Controller {

	@Autowired
	private studentRepository repo;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public student createdstudent(@RequestBody student student) {
		return repo.save(student);
	}
	
	@GetMapping
	public List<student> getall(){
		return repo.findAll();
	}
}








