package com.reports.jasper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reports.jasper.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
