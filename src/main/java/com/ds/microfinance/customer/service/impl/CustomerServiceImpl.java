package com.ds.microfinance.customer.service.impl;

import com.ds.microfinance.customer.exception.CustomerNotFoundException;
import com.ds.microfinance.customer.model.Customer;
import com.ds.microfinance.customer.repository.CustomerRepository;
import com.ds.microfinance.customer.service.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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

    @Override
    public void saveOrUpdate(Customer customer) {
         customerRepository.save(customer);
    }

    @Override
    public Customer getCustomer(int id) {
       return customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException(id,"mob","Pan"));
    }

    @Override
    public Customer Update(Customer customer,int id) {
        Customer updatecustomer=new Customer();
        customerRepository.findById(id);
        updatecustomer.setMobile(customer.getMobile());
        updatecustomer.setMobile(customer.getMobile());
        return updatecustomer;
    }


}
