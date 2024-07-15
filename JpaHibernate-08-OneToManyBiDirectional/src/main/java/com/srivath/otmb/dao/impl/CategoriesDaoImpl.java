package com.srivath.otmb.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.srivath.otmb.dao.CategoriesDao;
import com.srivath.otmb.entities.Category;

public class CategoriesDaoImpl implements CategoriesDao {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveCategory(Category category) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		try {
			em.persist(category);
			txn.commit();
			System.out.println("category persisted");
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	@Override
	public Category fetchCategory(Integer categoryId) {
		EntityManager em = factory.createEntityManager();
		Category category = em.find(Category.class, categoryId);
		em.close();
		return category;
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		Category category = em.find(Category.class, categoryId);
		txn.begin();
		try {
			em.remove(category);
			txn.commit();
			System.out.println("category removed");
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

}
