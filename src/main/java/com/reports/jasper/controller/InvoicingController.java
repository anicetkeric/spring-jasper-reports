package com.reports.jasper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reports.jasper.domain.model.Invoice;
import com.reports.jasper.service.SaleOrderService;


@RestController
@RequestMapping("/api")
public class InvoicingController {

	@Autowired
    private SaleOrderService entityService;

    @GetMapping(value = "/invoicing/{orderId}")
    public ResponseEntity<Invoice> createUser(@PathVariable int orderId){
       
        Invoice invoice = entityService.getInvoiceData(orderId);
       
        return new ResponseEntity<>(invoice,HttpStatus.CREATED);
    } 
    
    
}
