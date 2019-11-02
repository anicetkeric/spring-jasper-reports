package com.reports.jasper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reports.jasper.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
