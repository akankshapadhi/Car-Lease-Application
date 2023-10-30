package com.carlease.service;

import java.util.Optional;

import com.carlease.domain.Customer;

/**
 * Service that manages Customer entities
 * @author Akanksha Padhi
 */
public interface CustomerService {
	
	/**
	 * 
	 * @param customer is saved
	 */
	public void saveCustomer(Customer customer);
	
	/**
	 * 
	 * @return all customers
	 */
	public Iterable<Customer> findAllCustomers();
	
	/**
	 * 
	 * @param id of customer is parsed
	 * @return specific customer
	 */
	public Optional<Customer> findCustomerById(long id);
	
	/**
	 * 
	 * @param newCustomer instance is parsed
	 * @return customer is saved
	 */
	public Customer save(Customer newCustomer);
}
