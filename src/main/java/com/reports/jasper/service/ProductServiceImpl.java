package com.reports.jasper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reports.jasper.entities.Product;
import com.reports.jasper.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository repository;

	@Override
	public Product create(Product product) {

		Product entity;

		try {
			entity = repository.save(product);
		} catch (Exception ex) {
			return null;
		}
		return entity;
	}

}
