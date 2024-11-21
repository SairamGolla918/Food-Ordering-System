package com.fos.saiee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fos.saiee.entities.Food_Category;
import com.fos.saiee.service.FoodCategoryServiceI;

@RestController
@RequestMapping(value="foodcategory")
public class FoodCategoryController {
	
	@Autowired
	private FoodCategoryServiceI service;
	
	@GetMapping(path="/getAll")
	public  ResponseEntity<List<Food_Category>> findAll(){
		List<Food_Category> list=service.getCategories();
		
		return new ResponseEntity<List<Food_Category>>(list,new HttpHeaders(),HttpStatus.OK);
	}


}
