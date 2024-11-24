package com.fos.saiee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fos.saiee.entities.Receipt;
import com.fos.saiee.service.ReceiptServiceI;

@RestController
@RequestMapping(value="receipt")
public class ReceiptController {

	@Autowired
	ReceiptServiceI service;
	
	@GetMapping(path="/getAll")
	public ResponseEntity<List<Receipt>> getReceipts(){
		
		List<Receipt> list = service.getReceipts();
		
		return new ResponseEntity<List<Receipt>>(list,new HttpHeaders(),HttpStatus.OK);
	}
}
