package com.reports.jasper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reports.jasper.entities.OrderLine;

public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {

}
