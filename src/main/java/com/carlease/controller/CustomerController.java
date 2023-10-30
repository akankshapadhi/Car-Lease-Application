package com.carlease.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carlease.domain.Customer;
import com.carlease.repository.CustomersRepository;

/**
 * All operations with a customer will be routed by this controller.
 * 
 * @author Akanksha Padhi
 */
@Controller
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	CustomersRepository customerRepo;

	/**
	 * 
	 * @param id of customer is parsed
	 * @return customer of specific id
	 */
	@GetMapping("/customers/{id}")
	  public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int id) {
	    Optional<Customer> customerData = customerRepo.findById(id);

	    if (customerData.isPresent()) {
	      return new ResponseEntity<>(customerData.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	
	/**
	 * 
	 * @param customer is parsed
	 * @return new customer is created and inserted into database
	 */
	@PostMapping("/customers")
	  public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
	    try {
	    	Customer _customer = customerRepo.save(customer);
	      return new ResponseEntity<>(_customer, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
	/**
	 * 
	 * @param id of customer is parsed
	 * @param customer of that specific id
	 * @return modified customer details
	 */
	@PutMapping("/customers/{id}")
	  public ResponseEntity<Customer> updateCustomer(@PathVariable("id") int id, @RequestBody Customer customer) {
	    Optional<Customer> customerData = customerRepo.findById(id);

	    if (customerData.isPresent()) {
	    	Customer _customer = customerData.get();
	      _customer.setName(customer.getName());
	      _customer.setPhone(customer.getPhone());
	      _customer.setStreet(customer.getStreet());
	      _customer.setZip(customer.getZip());
	      _customer.setPlace(customer.getPlace());
	      _customer.setEmail(customer.getEmail());
	      _customer.setHouse(customer.getHouse());
	      return new ResponseEntity<>(customerRepo.save(_customer), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
}
