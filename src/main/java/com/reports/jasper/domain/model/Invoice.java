package com.reports.jasper.domain.model;

import java.util.List;

import com.reports.jasper.domain.entities.SaleOrder;
import com.reports.jasper.domain.entities.SaleOrderLine;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Invoice {
	
	private SaleOrder order;
	private List<SaleOrderLine> lines;

}
