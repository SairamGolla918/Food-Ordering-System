package com.fos.saiee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fos.saiee.dao.RestaurantDaoI;
import com.fos.saiee.entities.Restaurant;

@Service
public class RestaurantServiceImpl implements RestaurantServiceI{
	
	@Autowired
	RestaurantDaoI dao;
	
	public List<Restaurant> getRestaurants(){
		return dao.getRestautrants();
	}

}
