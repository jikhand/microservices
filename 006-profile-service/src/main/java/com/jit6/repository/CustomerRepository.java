package com.jit6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jit5.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
