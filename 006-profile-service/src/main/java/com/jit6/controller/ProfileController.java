package com.jit6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jit5.model.Customer;
import com.jit6.service.CustomerService;



@RestController
@RequestMapping(value = "/services")
public class ProfileController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);
		
	}

}
