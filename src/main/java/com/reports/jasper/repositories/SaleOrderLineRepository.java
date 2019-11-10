package com.reports.jasper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reports.jasper.domain.entities.SaleOrderLine;
import com.reports.jasper.domain.entities.SaleOrder;
import java.util.List;

public interface SaleOrderLineRepository extends JpaRepository<SaleOrderLine, Integer> {

	List<SaleOrderLine> findByOrder(SaleOrder order);
}
