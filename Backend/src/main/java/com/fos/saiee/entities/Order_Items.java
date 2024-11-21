package com.fos.saiee.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Order_Items {
	
	@Id
	@GeneratedValue
	int order_item_id;
	int order_id;
	int item_id;
	int quantity;
	double amount;
	
	public Order_Items(){}

	public Order_Items(int order_item_id, int order_id, int item_id, int quantity, double amount) {
		super();
		this.order_item_id = order_item_id;
		this.order_id = order_id;
		this.item_id = item_id;
		this.quantity = quantity;
		this.amount = amount;
	}

	public int getOrder_item_id() {
		return order_item_id;
	}

	public void setOrder_item_id(int order_item_id) {
		this.order_item_id = order_item_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	

}
