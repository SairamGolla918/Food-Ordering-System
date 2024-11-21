package com.fos.saiee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fos.saiee.dao.*;
import com.fos.saiee.entities.Order_Items;

@Service
public class OrderedItemsServiceImpl implements OrderedItemsServiceI{

	@Autowired
	private OrderItemsDaoI dao;
	
	public List<Order_Items> getOrderedItems()
	{
		return dao.getOrderedItems();
	}
}
