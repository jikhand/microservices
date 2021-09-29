package com.jit6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jit5.model.Customer;
import com.jit6.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) {
		
		return customerRepository.save(customer);
	}

}
