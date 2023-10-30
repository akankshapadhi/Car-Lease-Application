package com.carlease.repository;

import org.springframework.data.repository.CrudRepository;

import com.carlease.domain.Car;

/**
 * The CRUD repository for Car entities
 * @author Akanksha Padhi
 */
public interface CarRepository extends CrudRepository<Car, Long> {

}