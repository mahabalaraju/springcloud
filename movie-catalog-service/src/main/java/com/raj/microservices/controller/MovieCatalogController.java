package com.raj.microservices.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.raj.microservices.model.CatalogItems;
import com.raj.microservices.model.Movie;
import com.raj.microservices.model.Ratings;

@RestController
public class MovieCatalogController {
	@Autowired
	private RestTemplate template;

	@Autowired
	private WebClient.Builder webClient;

	@GetMapping("/{userId}")
	public List<CatalogItems> getcatalog(@PathVariable("userId") String userId) {
		// RestTemplate template=new RestTemplate();

		List<Ratings> ratings = Arrays.asList(new Ratings("121", 2), new Ratings("122", 3));
		// get all rated movies.., for each movieId ,call movie info service and get
		// details
		//// put all of them together

		return ratings.stream().map(rating -> {
			// Movie
			// movie=template.getForObject("http://localhost:8081/movie/1"+rating.getMovieId(),
			// Movie.class);

			Movie movie = webClient.build()
					.get()
					.uri("http://localhost:8081/movie/1" + rating.getMovieId())
					.retrieve()
					.bodyToMono(Movie.class)
					.block();
			return new CatalogItems(movie.getName(), " Desc", rating.getRatings());

		}).collect(Collectors.toList());

		// return Collections.singletonList(new CatalogItems("transformers","desc",3));
	}
}
