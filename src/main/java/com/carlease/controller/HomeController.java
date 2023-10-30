package com.carlease.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.carlease.domain.Car;
import com.carlease.domain.Customer;
import com.carlease.service.CarService;
import com.carlease.service.CustomerService;
import com.carlease.service.LeaseServiceImpl;

/** 
* This controller resolves all views for customer, car and lease calculation
* @author Akanksha Padhi
* 
*/
@Controller
public class HomeController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CarService carService;
	
	@Autowired
	LeaseServiceImpl leaseServiceImpl;
	
	/**
	 * 
	 * @return landing page
	 */
	@GetMapping("/") 
	public String getRoot() {
		return "redirect:/index.html";
	}
	
	/**
	 * 
	 * @return path of index.html
	 */
	@GetMapping("/index.html")
	public String getIndex() {
		System.out.println("getIndex was called");
		return "/index";
	}
	
	/**
	 * 
	 * @return view of all customers
	 */
	@RequestMapping("/customers")
	public ModelAndView customers() {
		Iterable<Customer> list =
				customerService.findAllCustomers();
		return new ModelAndView("customers",
			 "customerList", list);
	}
	
	/**
	 * 
	 * @return view of all cars
	 */
	@RequestMapping("/cars")
	public ModelAndView cars() {
		Iterable<Car> list =
				carService.findAllCars();
		return new ModelAndView("cars",
			 "carList", list);
	}
	
	/**
	 * 
	 * @return view of lease along with list of cars
	 * @throws ClassNotFoundException exception
	 * @throws SQLException exception
	 */
	@GetMapping("/lease")
	public ModelAndView lease() throws ClassNotFoundException, SQLException {
	
		Iterable<Car> list = carService.findAllCars();
		ModelAndView mav = new ModelAndView("lease", "carList", list);
		return mav.addObject("leaseRatePerMonth", leaseServiceImpl.getLeaseRate());
	}
		}

