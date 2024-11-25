package com.fos.saiee.dao;

import java.util.List;
import java.util.Queue;

import org.springframework.stereotype.Repository;

import com.fos.saiee.entities.Restaurant;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class RestaurantDaoImpl implements RestaurantDaoI {
	
	@PersistenceContext
	EntityManager entityManager;
	
	
	public List<Restaurant> getRestautrants(){
		
		Query query = entityManager.createQuery("select r from Restaurant r");
		
		List<Restaurant> list = query.getResultList();
		
		return list;
	}

}
