package com.carlease.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.carlease.domain.Customer;

/**
 * This is a CRUD repository for Customer entity
 * @author Akanksha Padhi
 */
public interface CustomersRepository extends CrudRepository<Customer, Long> {
	
	/**
	 * 
	 * @param id of customer is parsed
	 * @return specific Customer
	 */
	public Optional<Customer> findById(int id);
}
