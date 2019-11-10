package com.reports.jasper.service;

import com.reports.jasper.domain.model.Invoice;

public interface SaleOrderService {

	Invoice getInvoiceData(int orderId);
}
