package com.fos.saiee.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.fos.saiee.entities.Food_Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FoodCategoryDaoImpl implements FoodCategoryDaoI
{
	@PersistenceContext
    private EntityManager entityManager;
	
	public List<Food_Category> getCategories(){
		Query q = entityManager.createQuery("select e from Food_Category e");
	    List<Food_Category> list=q.getResultList();
		return list;
	}
}
