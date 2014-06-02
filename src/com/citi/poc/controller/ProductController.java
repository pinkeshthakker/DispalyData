package com.citi.poc.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.citi.poc.entity.Product;
import com.citi.poc.entity.SalesEntry;
import com.citi.poc.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "insertProduct.do")
	public String showUserList(Model model) {
		Product product = new Product();
		Set<SalesEntry> salesEntrySet = new HashSet<SalesEntry>();
		product.setProductName("Product1");
		for (int i = 0; i < 2; i++) {
			SalesEntry salesEntry = new SalesEntry();
			salesEntry.setDateOfSale(new Date());
			salesEntry.setProduct(product);
			salesEntrySet.add(salesEntry);
		}
		product.setSalesEntry(salesEntrySet);
		productService.insertProduct(product);
		// model.addAttribute("users", users);
		return "list";
	}
}
