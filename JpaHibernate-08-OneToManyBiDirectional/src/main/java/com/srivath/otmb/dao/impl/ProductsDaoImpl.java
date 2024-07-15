package com.srivath.otmb.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.srivath.otmb.dao.ProductsDao;
import com.srivath.otmb.entities.Product;

public class ProductsDaoImpl implements ProductsDao {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveProduct(Product product) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		try {
			em.merge(product);
			txn.commit();
			System.out.println("product persisted");
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

	@Override
	public Product fetchProduct(Integer productId) {
		EntityManager em = factory.createEntityManager();
		Product product = em.find(Product.class, productId);
		em.close();
		return product;
	}

	@Override
	public void deleteProduct(Integer productId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		Product product = em.find(Product.class, productId);
		System.out.println("ProductName"+product.getProductName());
		txn.begin();
		try {
			em.remove(product);
			txn.commit();
			System.out.println("product removed from DB");
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

}
