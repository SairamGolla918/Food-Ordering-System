package com.fos.saiee.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Menu {

	@Id
	int item_id;
	String item_name;
	Double price;
	int  restaurant_id;
	int category_id;
	
	public  Menu(){}
	
	public Menu(int item_id, String item_name, Double price, int restaurant_id, int category_id) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.price = price;
		this.restaurant_id = restaurant_id;
		this.category_id = category_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	
	
	
	
}
