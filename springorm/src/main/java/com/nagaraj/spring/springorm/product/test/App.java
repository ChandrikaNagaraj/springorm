package com.nagaraj.spring.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nagaraj.spring.springorm.product.dao.ProductDao;
import com.nagaraj.spring.springorm.product.entity.Product;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("com/nagaraj/spring/springorm/product/test/config.xml");
    	ProductDao pdimpl= (ProductDao) context.getBean("productdao");
    	Product product= new Product();
    	product.setId(1000);
    	product.setName("IPhone");
    	product.setDesc("It is an excellent");
    	product.setPrice(700);
       int result=pdimpl.transactionManager(product);
    	System.out.println("The Transaction is successfull  " + result);
    }
}
