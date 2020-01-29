package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	@Query("SELECT c from Customer c WHERE c.firstName = :firstName")
	Customer findByFirstName(@Param("firstName") String firstName);

}
