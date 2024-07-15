package com.srivath.otmb.dao;

import com.srivath.otmb.entities.Product;

public interface ProductsDao {
	void saveProduct(Product product);

	Product fetchProduct(Integer productId);

	void deleteProduct(Integer productId);

}
