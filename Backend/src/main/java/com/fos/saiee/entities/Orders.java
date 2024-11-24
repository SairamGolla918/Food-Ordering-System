package com.fos.saiee.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Orders {
	
	@Id
//	@GeneratedValue
	int order_id;
	String ordered_time;
	int restaurant_id;
	int customer_id;
	Double total_amount;
	
	public Orders(){
	}
	
	public Orders(int order_id, String ordered_time, int restaurant_id,int customer_id,Double total_amount) {
		super();
		this.order_id = order_id;
		this.ordered_time = ordered_time;
		this.restaurant_id = restaurant_id;
		this.total_amount = total_amount;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getOrdered_time() {
		return ordered_time;
	}

	public void setOrdered_time(String ordered_time) {
		this.ordered_time = ordered_time;
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	
	public int getCustomer_id() {
		return customer_id;
	}
	
	public  void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public Double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Double total_amount) {
		this.total_amount = total_amount;
	}
	
	
	
	
	
	

}
