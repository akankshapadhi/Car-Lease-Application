package com.carlease.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This entity represents a specific car that can be rented
 * @author Akanksha Padhi
 *
 */
@Entity
@Table(name="CARS")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	String make;
	String model;
	String version;
	int doors;
	double emission;
	double gross;
	/**
	 * parameter used for nettPrice of car
	 */
	public double nett;
	
	/**
	 * car constructor
	 */
	public Car(){
		int id;
		String make;
		String model;
		String version;
		int doors;
		double emission;
		double gross;
		double nett;
	}	
	
	/**
	 * 
	 * @param id for car id
	 * @param make for car make
	 * @param model for car model
	 * @param version for car version
	 * @param doors for car doors
	 * @param emission for car emission
	 * @param gross for car gross price
	 * @param nett for car nett price
	 */
	public Car(int id, String make, String model, String version, int doors, double emission, double gross, double nett){
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.version = version;
		this.doors = doors;
		this.emission = emission;
		this.gross = gross;
		this.nett = nett;
	}
	
	/**
	 * 
	 * @return for id of car
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id of car is input
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * 
	 * @return for make of car
	 */
	public String getMake() {
		return make;
	}

	/**
	 * 
	 * @param make of car is input
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * 
	 * @return for car model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * 
	 * @param model of car is input
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * 
	 * @return to get car's version
	 */
	public String getVersion() {
		return version;
	}
	
	/**
	 * 
	 * @param version of car is input
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	
	/**
	 * 
	 * @return number of car doors
	 */
	public int getDoors() {
		return doors;
	}
	
	/**
	 * 
	 * @param doors of car is input
	 */
	public void setDoors(int doors) {
		this.doors = doors;
	}

	/**
	 * 
	 * @return emission by car
	 */
	public double getEmission() {
		return emission;
	}
	
	/**
	 *  
	 * @param emission of car is input
	 */
	public void setEmission(double emission) {
		this.emission = emission;
	}
	
	/**
	 * 
	 * @return for gross price of car
	 */
	public double getGross() {
		return gross;
	}
	
	/**
	 * 
	 * @param gross price is input
	 */
	public void setGross(double gross) {
		this.gross = gross;
	}
	
	/**
	 * 
	 * @return for car's nett price
	 */
	public double getNett() {
		return nett;
	}
	
	/**
	 * 
	 * @param nett price of car is input
	 */
	public void setNett(double nett) {
		this.nett = nett;
	}	
}

