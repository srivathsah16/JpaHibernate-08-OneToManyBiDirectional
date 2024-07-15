package com.srivath.otmb.dao;

import com.srivath.otmb.entities.Category;

public interface CategoriesDao {
	void saveCategory(Category category);

	Category fetchCategory(Integer categoryId);

	void deleteCategory(Integer categoryId);
}
