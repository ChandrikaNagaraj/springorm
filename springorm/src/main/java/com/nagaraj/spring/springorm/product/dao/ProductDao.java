package com.nagaraj.spring.springorm.product.dao;

import com.nagaraj.spring.springorm.product.entity.Product;

public interface ProductDao {
	int transactionManager(Product product);

}
