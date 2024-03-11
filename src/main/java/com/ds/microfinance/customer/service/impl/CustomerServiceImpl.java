package com.ds.microfinance.customer.service.impl;

import com.ds.microfinance.customer.model.Customer;
import com.ds.microfinance.customer.repository.CustomerRepository;
import com.ds.microfinance.customer.service.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CustomerServiceImpl implements CustomerServices {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll().stream().collect(Collectors.toList());
    }
}
