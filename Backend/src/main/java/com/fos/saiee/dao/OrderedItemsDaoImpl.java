package com.fos.saiee.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.fos.saiee.entities.Order_Items;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class OrderedItemsDaoImpl implements OrderItemsDaoI{

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Order_Items> getOrderedItems(){
		Query q = entityManager.createQuery("select e from Order_Items e");
	    List<Order_Items> list = q.getResultList();
		return list;
	}
}
