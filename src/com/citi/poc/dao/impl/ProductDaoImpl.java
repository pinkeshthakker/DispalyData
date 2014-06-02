package com.citi.poc.dao.impl;

import java.util.List;

import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import com.citi.poc.dao.ProductDao;
import com.citi.poc.entity.Product;

@Repository("productDao")
public class ProductDaoImpl extends AbstractDaoImpl<Product, String> implements ProductDao {

    protected ProductDaoImpl() {
        super(Product.class);
    }
	@Override
	public List<Product> getAllProducts() {
		 return getCurrentSession().createCriteria(entityClass).setMaxResults(500).list();
	}
	@Override
	public List getAllProductsSalesAndCount(){
		List result = getCurrentSession().createCriteria(entityClass)       
        .setProjection(Projections.projectionList()
                .add(Projections.groupProperty("PRODUCT_ID"))
                .add(Projections.sum("SALEAMOUNT"))
                .add(Projections.count("someColumn"))           
        ).list();
		return result;
	}
}
