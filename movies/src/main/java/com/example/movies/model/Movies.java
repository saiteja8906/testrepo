package com.example.movies.model;


public class Movies {

	private int id;
	private String name;
	private int price;
	private int nooftickets;
	private int cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNooftickets() {
		return nooftickets;
	}
	public void setNooftickets(int nooftickets) {
		this.nooftickets = nooftickets;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Movies(int id, String name, int price, int nooftickets, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.nooftickets = nooftickets;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Movies [id=" + id + ", name=" + name + ", price=" + price + ", nooftickets=" + nooftickets + ", cost="
				+ cost + "]";
	}
	
}
