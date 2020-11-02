package com.nagaraj.spring.springorm.product.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.nagaraj.spring.springorm.product.dao.ProductDao;
import com.nagaraj.spring.springorm.product.entity.Product;

@Component("productdao")
public class ProductDaoimpl  implements ProductDao{
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	@Bean(name="transactionManager") 
	public int transactionManager(Product product) {
		Integer result= (Integer) hibernateTemplate.save(product);
		return result;
	}

}
