package com.fos.saiee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fos.saiee.entities.Menu;

import com.fos.saiee.dao.MenuDaoI;

@Service
public class MenuServiceImpl implements MenuServiceI {

	@Autowired
	private MenuDaoI dao;
	
	public List<Menu> getMenu(){
		return dao.getMenu();
	}
}
