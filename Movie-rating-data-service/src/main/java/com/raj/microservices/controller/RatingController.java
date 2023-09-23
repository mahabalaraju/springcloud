package com.raj.microservices.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.microservices.model.Ratings;

@RestController
@RequestMapping("/ratingsData")
public class RatingController {

	@GetMapping("/{movieId}")
	public Ratings getRatings(@PathVariable("movieId")String movieId) {
		return new Ratings("movieId",3);
	}
}
