package com.example.price.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Price {
	@Id
	private int id;
	private String moviename;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return moviename;
	}
	public void setName(String name) {
		this.moviename = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Price(int id, String name, int price) {
		super();
		this.id = id;
		this.moviename = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Movies [id=" + id + ", name=" + moviename + ", price=" + price + "]";
	}
	public Price() {
		super();
		// TODO Auto-generated constructor stub
	}
}
