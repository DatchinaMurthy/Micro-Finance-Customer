package com.ds.microfinance.customer.controller;


import com.ds.microfinance.customer.model.Customer;
import com.ds.microfinance.customer.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping("/getAllCustomers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

}
