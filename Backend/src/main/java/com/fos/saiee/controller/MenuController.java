package com.fos.saiee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fos.saiee.service.MenuServiceI;
import com.fos.saiee.entities.*;

@RestController
@RequestMapping(value="menu")
public class MenuController 
{
	@Autowired
	private MenuServiceI service;
	
	@GetMapping(path="/getAll")
	public  ResponseEntity<List<Menu>> findAll(){
		List<Menu> list=service.getMenu();
		
		return new ResponseEntity<List<Menu>>(list,new HttpHeaders(),HttpStatus.OK);
	}

}
