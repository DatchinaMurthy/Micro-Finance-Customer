package com.ds.microfinance.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient
public class MicroFinanceCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroFinanceCustomerApplication.class, args);
	}

}
