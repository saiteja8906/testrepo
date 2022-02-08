package com.example.price.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.price.model.Price;
import com.example.price.repo.PriceRepository;

@RestController
public class PriceController {
@Autowired
PriceRepository pr;

@GetMapping("price/{moviename}")
public Price getprice(@PathVariable String moviename)
{
	Price p=pr.findByMoviename(moviename);
	return p;
}
}
