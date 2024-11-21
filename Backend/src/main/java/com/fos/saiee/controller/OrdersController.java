package com.fos.saiee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fos.saiee.entities.Orders;
import com.fos.saiee.service.OrdersServiceI;

@RestController
@RequestMapping(value="orders")
public class OrdersController {

	@Autowired
	OrdersServiceI service;
	
	@GetMapping(path="getAll")
	public ResponseEntity<List<Orders>> getOrders(){
		
		List<Orders> list = service.getOrders();
		
		return new ResponseEntity<List<Orders>>(list,new HttpHeaders(),HttpStatus.OK);
		
	}
	
}
