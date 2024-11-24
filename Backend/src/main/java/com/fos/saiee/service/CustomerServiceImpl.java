package com.fos.saiee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fos.saiee.dao.CustomerDaoI;
import com.fos.saiee.entities.Customer;

@Service
public class CustomerServiceImpl implements CustomerServiceI {

	@Autowired
	CustomerDaoI dao;
	
	public List<Customer> getCustomers(){
		
		return dao.getCustomers();
	}
}
