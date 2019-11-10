package com.reports.jasper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reports.jasper.domain.entities.SaleOrder;
import com.reports.jasper.domain.entities.SaleOrderLine;
import com.reports.jasper.repositories.SaleOrderLineRepository;

@Service
public class SaleOrderLineServiceImpl implements SaleOrderLineService {

	@Autowired
	SaleOrderLineRepository repository; 
	
	public List<SaleOrderLine> getAllByOrderId(int orderId){
		SaleOrder saleOrder = new SaleOrder();
		saleOrder.setId(orderId);
		return repository.findByOrder(saleOrder);
	}
}
