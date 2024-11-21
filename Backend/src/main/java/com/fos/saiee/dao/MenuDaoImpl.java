package com.fos.saiee.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.fos.saiee.entities.*;
import jakarta.persistence.*;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MenuDaoImpl implements MenuDaoI
{
	@PersistenceContext
    private EntityManager entityManager;
	
	public List<Menu> getMenu(){
		Query q = entityManager.createQuery("select e from Menu e");
	    List<Menu> list=q.getResultList();
		return list;
	}
}
