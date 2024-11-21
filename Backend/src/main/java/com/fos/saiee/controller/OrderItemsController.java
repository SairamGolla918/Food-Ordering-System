package com.fos.saiee.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fos.saiee.entities.Order_Items;
import com.fos.saiee.service.OrderedItemsServiceI;

@RestController
@RequestMapping(value="ordereditems")
public class OrderItemsController{
	
	@Autowired
	OrderedItemsServiceI service;
	
	@GetMapping(path="/getAll")
	public ResponseEntity<List<Order_Items>> getOrderedItems()
	{
		List<Order_Items> list=service.getOrderedItems();
		
		return new ResponseEntity<List<Order_Items>>(list,new HttpHeaders(),HttpStatus.OK);
	}
	

}
