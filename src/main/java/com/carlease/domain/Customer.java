package com.carlease.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
* This entity represents a specific customer
* @author Akanksha Padhi
* 
*/
@Entity
@Table(name="CUSTOMERS")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;

	String name;
	String password;
	String street;
	String house;
	String zip;
	String place;
	String email;
	long phone;
	
	/**
	 * customer constructor
	 */
	public Customer() {
		int id;
		String name;
		String password;
		String street;
		String house;
		String zip;
		String place;
		String email;
		long phone;
	}
	
	/**
	 * 
	 * @param id for customer id
	 * @param name for customer name
	 * @param password for customer password
	 * @param street for customer street
	 * @param house for customer house number
	 * @param zip for customer zip code
	 * @param place for customer place
	 * @param email for customer email address
	 * @param phone  for customer phone number
	 */
	public Customer(int id, String name, String password, String street, String house, String zip, String place, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.street = street;
		this.house = house;
		this.zip = zip;
		this.place = place;
		this.email = email;
		this.phone = phone;
	}
	
	/**
	 * 
	 * @return customer id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id of customer is input
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * 
	 * @return customer name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param name of customer is input
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return password of customer
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * 
	 * @param password of customer is input
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 
	 * @return street of customer
	 */
	public String getStreet() {
		return street;
	}
	
	/**
	 * 
	 * @param street of customer is input
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	
	/**
	 * 
	 * @return house number of customer
	 */
	public String getHouse() {
		return house;
	}
	
	/**
	 * 
	 * @param house number of customer is input
	 */
	public void setHouse(String house) {
		this.house = house;
	}
	
	/**
	 * 
	 * @return zip code of customer
	 */
	public String getZip() {
		return zip;
	}
	
	/**
	 * 
	 * @param zip code of customer is input
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	/**
	 * 
	 * @return place of customer
	 */
	public String getPlace() {
		return place;
	}
	
	/**
	 * 
	 * @param place of customer is input
	 */
	public void setPlace(String place) {
		this.place = place;
	}
	
	/**
	 * 
	 * @return email address of customer
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * 
	 * @param email address of customer is input
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 
	 * @return phone number of customer
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * 
	 * @param phone number of customer is input
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + 
									", name=" + name + 
									", password=" + password + 
									", street=" + street + 
									", house=" + house + 
									", zip=" + zip +
									", place=" + place +
									", email=" + email +
									", phone=" + phone + "]";
	}
}