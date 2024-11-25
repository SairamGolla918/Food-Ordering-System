package com.fos.saiee.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Receipt 
{
	@Id
	@GeneratedValue
	int receipt_id;
	int order_id;
	
	public Receipt(){};
	
	public Receipt(int receipt_id, int order_id) {
		super();
		this.receipt_id = receipt_id;
		this.order_id = order_id;
	}

	public int getReceipt_id() {
		return receipt_id;
	}

	public void setReceipt_id(int receipt_id) {
		this.receipt_id = receipt_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
	
	
	
}
