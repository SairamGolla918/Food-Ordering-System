package com.fos.saiee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fos.saiee.entities.Customer;
import com.fos.saiee.service.CustomerServiceI;

@RestController
@RequestMapping(value="customer")
public class CustomerController {
	
	@Autowired
	CustomerServiceI service;
	
	@GetMapping(path="/getAll")
	public ResponseEntity<List<Customer>> getCustomers(){
		
		List<Customer> list = service.getCustomers();
		
		return new ResponseEntity<List<Customer>>(list,new HttpHeaders(),HttpStatus.OK);
	}

}
