package com.example.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.domain.Customer;
import com.example.repository.CustomerRepository;

@Component
public class BootStrapData implements CommandLineRunner{
	
	private final CustomerRepository customerRepository;
	
	public BootStrapData(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Loading customer data");
		
		Customer c1 = new Customer();
		c1.setFirstName("Juan");
		c1.setLastName("Salcedo");
		customerRepository.save(c1);
		
		Customer c2 = new Customer();
		c2.setFirstName("Diego");
		c2.setLastName("Salazar");
		customerRepository.save(c2);
		
		System.out.println("Customer saved: " + customerRepository.count());
	}

}
