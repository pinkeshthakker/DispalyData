package com.citi.poc.dao;

import java.util.List;

import com.citi.poc.entity.Product;

public interface ProductDao extends AbstractDao<Product, String> {
    
    List<Product> getAllProducts();
    List getAllProductsSalesAndCount();
}
