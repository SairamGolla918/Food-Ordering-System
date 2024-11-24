package com.fos.saiee.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fos.saiee.entities.Receipt;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class ReceiptDaoImpl implements ReceiptDaoI
{
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Receipt> getReceipts(){
		
		Query query = entityManager.createQuery("select R from Receipt R");
		
		List<Receipt> list = query.getResultList();
		
		return list;
		
	}

}
