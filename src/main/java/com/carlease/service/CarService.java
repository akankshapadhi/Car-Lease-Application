package com.carlease.service;

import java.util.Optional;

import com.carlease.domain.Car;

/**
 * Service that manages Car entities
 * @author Akanksha Padhi
 */
public interface CarService {
	
	/**
	 * 
	 * @return list of all cars
	 */
	public Iterable<Car> findAllCars();
	
	/**
	 * 
	 * @param id of car as input
	 * @return specific car
	 */
	public Optional<Car> findCarById(long id);
	
	/**
	 * 
	 * @param car is saved
	 */
	public void saveCar(Car car);
}
