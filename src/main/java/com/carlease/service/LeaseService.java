package com.carlease.service;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Service that manages calculations for lease
 * @author Akanksha Padhi
 */
public interface LeaseService {
	
	/**
	 * 
	 * @return lease rate per month of each car
	 * @throws ClassNotFoundException exception
	 * @throws SQLException exception
	 */
	public ArrayList<BigDecimal> getLeaseRate() throws ClassNotFoundException, SQLException;
}
