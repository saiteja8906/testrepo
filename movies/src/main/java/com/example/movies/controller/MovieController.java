package com.example.movies.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.movies.model.Movies;

@RestController
public class MovieController {



	
	@GetMapping("/movie/{moviename}/price/nooftickets/{no}/cost")
	public Movies getprice(@PathVariable String moviename,@PathVariable int no)
	{
		Map<String,String> urivaraibles=new HashMap<>();
		urivaraibles.put("moviename",moviename);
		ResponseEntity<Movies> resent=new RestTemplate().getForEntity("http://localhost:8080/price/{moviename}", Movies.class ,urivaraibles);
		Movies mov=resent.getBody();
		int cost=no*mov.getPrice();
		return new Movies(mov.getId(),moviename,mov.getPrice(),no,cost);
	}
}
