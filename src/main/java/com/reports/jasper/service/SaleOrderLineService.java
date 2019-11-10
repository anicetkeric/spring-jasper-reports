package com.reports.jasper.service;

import java.util.List;

import com.reports.jasper.domain.entities.SaleOrderLine;

public interface SaleOrderLineService {
	 List<SaleOrderLine> getAllByOrderId(int orderId);
}
