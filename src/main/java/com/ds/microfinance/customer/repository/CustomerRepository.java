package com.ds.microfinance.customer.repository;

import com.ds.microfinance.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
