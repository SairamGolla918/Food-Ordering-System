package com.fos.saiee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fos.saiee.dao.ReceiptDaoI;
import com.fos.saiee.entities.Receipt;

@Service
public class ReceiptServiceImpl implements ReceiptServiceI {
	
	@Autowired
	ReceiptDaoI dao;
	
	public List<Receipt> getReceipts(){
		
		return dao.getReceipts();
	}
	

}
