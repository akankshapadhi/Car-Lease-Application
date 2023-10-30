package com.carlease.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlease.domain.Car;
import com.carlease.repository.CarRepository;

/**
 * Service that manages Car entities
 * @author Akanksha Padhi
 */
@Service
public class CarServiceImpl implements CarService {
	@Autowired
	private CarRepository carRepo;

	@Override
	public void saveCar(Car car) {
		carRepo.save(car);	
	}

	@Override
	public Iterable<Car> findAllCars() {
		return carRepo.findAll();
	}

	@Override
	public Optional<Car> findCarById(long id) {
		return carRepo.findById(id);
	}

}
