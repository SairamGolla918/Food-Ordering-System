package com.fos.saiee.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fos.saiee.dao.FoodCategoryDaoI;
import com.fos.saiee.entities.Food_Category;

@Service
public class FoodCategoryServiceImpl implements FoodCategoryServiceI{

	@Autowired
	private FoodCategoryDaoI dao;
	
	public List<Food_Category> getCategories(){
		
		return dao.getCategories();
	}
}
