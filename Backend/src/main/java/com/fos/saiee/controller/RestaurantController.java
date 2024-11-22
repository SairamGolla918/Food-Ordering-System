package com.fos.saiee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fos.saiee.service.RestaurantServiceI;
import com.fos.saiee.entities.Restaurant;

@RestController
@RequestMapping(value="restaurants")
public class RestaurantController {
	
	@Autowired
	RestaurantServiceI service;
	
	@GetMapping(path="/getAll")
	public ResponseEntity<List<Restaurant>> getRestaurants(){
		
		List<Restaurant> list = service.getRestaurants();
		
		return new ResponseEntity<List<Restaurant>>(list,new HttpHeaders(),HttpStatus.OK);
		
	}

}
