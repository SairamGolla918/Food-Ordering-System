package com.fos.saiee.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fos.saiee.entities.Orders;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class OrdersDaoImpl implements OrdersDaoI{
	
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Orders> getOrders(){
		Query query = entityManager.createQuery("select o from Orders o");
		
		List<Orders> list = query.getResultList();
		
		return list;
		
	}
	

}
