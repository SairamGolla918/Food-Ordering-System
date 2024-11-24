package com.fos.saiee.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fos.saiee.entities.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class CustomerDaoImpl implements CustomerDaoI
{
	@PersistenceContext
	EntityManager entityManager;

	public List<Customer> getCustomers(){
		
		Query query = entityManager.createQuery("select C from Customer C");
		
		List<Customer> list = query.getResultList();
		
		return list;
		
	}
}
