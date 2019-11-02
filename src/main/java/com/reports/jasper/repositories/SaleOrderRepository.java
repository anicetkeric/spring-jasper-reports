package com.reports.jasper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reports.jasper.entities.SaleOrder;

public interface SaleOrderRepository extends JpaRepository<SaleOrder, Long>{

}
