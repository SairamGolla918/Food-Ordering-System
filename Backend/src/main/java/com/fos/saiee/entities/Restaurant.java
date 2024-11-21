package com.fos.saiee.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Restaurant {
	
	@Id
	@GeneratedValue
	int  restaurant_id;
	String restaurant_name;
	
	public Restaurant(){}
	
	public Restaurant(int restaurant_id, String restaurant_name) {
		super();
		this.restaurant_id = restaurant_id;
		this.restaurant_name = restaurant_name;
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public String getRestaurant_name() {
		return restaurant_name;
	}

	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}
	
	
	
	
	

}
