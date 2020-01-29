package com.example.service;

import java.util.List;

import com.example.domain.Customer;

public interface CustomerService {
	
	Customer findCustomerById(Long id);
	List<Customer> findAllCustomer();
	Customer saveCustomer(Customer customer);
	Customer findByFirstName(String firstName);

}
