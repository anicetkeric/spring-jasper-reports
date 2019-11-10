package com.reports.jasper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reports.jasper.domain.entities.SaleOrder;
import com.reports.jasper.domain.model.Invoice;
import com.reports.jasper.repositories.SaleOrderRepository;


@Service
public class SaleOrderServiceImpl implements SaleOrderService {

	
	@Autowired
	SaleOrderRepository saleOrderRepository; 
	
	@Autowired
	SaleOrderLineService saleOrderLineService; 
	
	
	public Invoice getInvoiceData(int orderId) {
		Invoice invoice = new Invoice();
		
		try {
			SaleOrder order = saleOrderRepository.getOne(orderId);
			if(order != null) {
				invoice.setOrder(order);
				invoice.setLines(saleOrderLineService.getAllByOrderId(orderId));
			} 
			return invoice;
		}catch(Exception ex) {
			return null;
		}
	}
	
}
