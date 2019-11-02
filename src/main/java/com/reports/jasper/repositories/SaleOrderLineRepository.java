package com.reports.jasper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reports.jasper.entities.SaleOrderLine;

public interface SaleOrderLineRepository extends JpaRepository<SaleOrderLine, Long> {

}
