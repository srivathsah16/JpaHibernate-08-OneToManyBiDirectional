package com.srivath.otmb.test;

import java.util.Arrays;
import java.util.List;

import com.srivath.otmb.dao.CategoriesDao;
import com.srivath.otmb.dao.ProductsDao;
import com.srivath.otmb.dao.impl.CategoriesDaoImpl;
import com.srivath.otmb.dao.impl.ProductsDaoImpl;
import com.srivath.otmb.entities.Category;
import com.srivath.otmb.entities.Product;

public class TestApp {
	public static void main(String[] args) {

		CategoriesDao categoriesDao = new CategoriesDaoImpl();
		/*
		 * saveCategory()
		 */
//		Category category = new Category();
//		category.setCategoryId(1211);
//		category.setCategoryName("Instruments");
//		Product product1 = new Product(1243, "Violin", 6000.0, category);
//		Product product2 = new Product(5644, "Mandolin", 10000.0, category);
//		Product product3 = new Product(3423, "Guitar", 8000.0, category);
//		List<Product> products = Arrays.asList(product1,product2,product3);
//		category.setProducts(products);
//		
//		categoriesDao.saveCategory(category);

		/*
		 * fetchCategory()
		 */
//		Category category1 = categoriesDao.fetchCategory(1211);
//		System.out.println(category1);
//		category1.getProducts().stream().map(p -> p.getProductId() + " " + p.getProductName() + " " + p.getAmount())
//				.forEach(System.out::println);

		/*
		 * deleteCategory()
		 */
//		categoriesDao.deleteCategory(1211);

		ProductsDao productsDao = new ProductsDaoImpl();

		/*
		 * saveProduct()
		 */
//		Category c1=new Category(14354, "Electronics", null);
//		Product p1=new Product(6767, "Mobile", 10000.0, c1);
//		Product p2=new Product(7890, "TV", 40000.0, c1);
//		Product p3=new Product(4357, "Fridge", 20000.0, c1);
//		Product p4=new Product(7754, "Laptop", 50000.0, c1);
//		
//		productsDao.saveProduct(p1);
//		productsDao.saveProduct(p2);
//		productsDao.saveProduct(p3);
//		productsDao.saveProduct(p4);

		/*
		 * fetchProduct()
		 */
//		Product prod = productsDao.fetchProduct(6767);
//		System.out.println(prod);
//		prod.getCategory().getProducts().stream().map(p -> p.getProductName()).forEach(System.out::println);

		/*
		 * deleteProduct()
		 */
		productsDao.deleteProduct(7754);
	}
}
