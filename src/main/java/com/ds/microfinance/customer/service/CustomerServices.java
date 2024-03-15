package com.ds.microfinance.customer.service;

import com.ds.microfinance.customer.model.Customer;

import java.util.List;

public interface CustomerServices {

    List<Customer> getAllCustomers();

    void saveOrUpdate(Customer customer);

    Customer getCustomer(int id);


    Customer Update(Customer customer, int id);
}
