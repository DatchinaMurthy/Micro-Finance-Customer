package com.ds.microfinance.customer.repository;

import com.ds.microfinance.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
