package com.raj.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.microservices.model.Movie;

@RestController
@RequestMapping("/movie")
	public class MovieResources {
	
		@GetMapping("/{movieId}")
		public Movie getmovieInfo(@PathVariable("movieId") String movieId) {
			return new Movie(movieId,"test name");
		}
}
