package com.fos.saiee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fos.saiee.dao.OrdersDaoI;
import com.fos.saiee.entities.Orders;

@Service
public class OrdersServiceImpl implements OrdersServiceI {
	
	@Autowired
	OrdersDaoI dao;
	
	public List<Orders> getOrders(){
		return dao.getOrders();
	}

}
