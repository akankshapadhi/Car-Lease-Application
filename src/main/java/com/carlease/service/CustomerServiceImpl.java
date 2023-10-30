package com.carlease.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlease.domain.Customer;
import com.carlease.repository.CustomersRepository;

/**
 * Service that manages Customer entities
 * @author Akanksha Padhi
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomersRepository customerRepo;

	@Override
	public void saveCustomer(Customer customer) {
		customerRepo.save(customer);	
	}

	@Override
	public Iterable<Customer> findAllCustomers() {
		return customerRepo.findAll();
	}

	@Override
	public Optional<Customer> findCustomerById(long id) {
		return customerRepo.findById(id);
	}

	@Override
	public Customer save(Customer newCustomer) {
		return null;
	}
}
