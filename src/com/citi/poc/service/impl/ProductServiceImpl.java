package com.citi.poc.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.citi.poc.dao.ProductDao;
import com.citi.poc.entity.Product;

@Service("productService")
@Transactional(readOnly = true)
public class ProductServiceImpl {

	@Autowired
	private ProductDao productDao;

	public void insertProduct(Product product) {
		productDao.saveOrUpdate(product);
	}

	public void generateReport() {
		List productList = productDao.getAllProductsSalesAndCount();
	}

	private void displayObjectsList(List list) {
		Iterator iter = list.iterator();
		if (!iter.hasNext()) {
			System.out.println("No objects to display.");
			return;
		}
		while (iter.hasNext()) {
			System.out.println("New object");
			Object[] obj = (Object[]) iter.next();
			for (int i = 0; i < obj.length; i++) {
				System.out.println(obj[i]);
			}
		}
	}
}
