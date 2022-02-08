package com.example.price.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.price.model.Price;

public interface PriceRepository extends JpaRepository<Price, Integer> {

	
	Price findByMoviename(String moviename);
}
