package com.reports.jasper.service;

import java.util.List;

import com.reports.jasper.domain.entities.Product;

public interface ProductService {

	Product create(Product product);
	List<Product> getAll();
}
