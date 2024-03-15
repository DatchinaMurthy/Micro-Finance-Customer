package com.ds.microfinance.customer.controller;


import com.ds.microfinance.customer.model.Customer;
import com.ds.microfinance.customer.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "/customer" )
    public int saveOrUpdate(@RequestBody Customer customer){
        customerService.saveOrUpdate(customer);
        return customer.getId();
    }

    @PostMapping(path = "/customers" )
    public Customer Update(@RequestBody Customer customer){
        customerService.Update(customer,customer.getId());
        return customer;
    }

    @GetMapping("/getCustomer/{id}")
    public Customer getCustomer(@PathVariable int id){
        return customerService.getCustomer(id);
    }


}
