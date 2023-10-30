package com.carlease.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * Calculates lease rate
 * @author Akanksha Padhi
 */
@Component
public class LeaseServiceImpl implements LeaseService{

	/**
	 * consumed as double in first iteration
	 */
	public ArrayList<Double> carNettlist = new ArrayList<Double>();
	
	/**
	 * consumed as BigDecimal in second iteration
	 */
	public List<BigDecimal> alteredNettList = new ArrayList<BigDecimal>();

	/**
	 * final list of lease rate per month is returned
	 */
	public ArrayList<BigDecimal> leaseRatePerMonth = new ArrayList<BigDecimal>();
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "password";
    
    public ArrayList<BigDecimal> getLeaseRate() throws ClassNotFoundException, SQLException {

    			try {
    			
    				Class.forName("com.mysql.jdbc.Driver");
    				
    				Connection connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
    				Statement statement = connection.createStatement();
    	
    	            ResultSet resultSet = statement.executeQuery("SELECT NETT FROM CARS");
    	            //first iteration
    	            while (resultSet.next()) {
    	            	double carNett = resultSet.getDouble("nett");
    	            	carNettlist.add(carNett);
    	            }
    	            //second iteration
    	            for (double nettListObtained : carNettlist) {
    	            	alteredNettList.add(new BigDecimal(nettListObtained));	
    	            }
    	            	
    	            	BigDecimal leaseMileage = new BigDecimal("45000.00");
    	        		BigDecimal leaseDuration = new BigDecimal("60");
    	        		BigDecimal leaseInterestRate = new BigDecimal("4.5");
    	        		
    	        		for(BigDecimal nettListForCalculation : alteredNettList) {
    	        			BigDecimal a = null;
    	        			
    	        			a = (((leaseMileage.divide(BigDecimal.valueOf(12),2,RoundingMode.HALF_EVEN))
        	        				.multiply(leaseDuration))
        	        				.divide(nettListForCalculation,2,RoundingMode.HALF_EVEN))
        	        				.add((((leaseInterestRate)
        	        						.divide(BigDecimal.valueOf(100),4,RoundingMode.HALF_EVEN))
        	        						.multiply(nettListForCalculation))
        	        						.divide(BigDecimal.valueOf(12),2,RoundingMode.HALF_EVEN));
    	        			
    	        			leaseRatePerMonth.add(a);
    	        		}
    	        		resultSet.close();
    	        		statement.close();
    	        		connection.close();
    	        		} catch (ClassNotFoundException e) {
    	        			System.out.println("MySQL jdbc driver not found");
    	        		} catch (SQLException e) {
    	        			System.out.println("Error executing SQL query");
    	        		}
    	        		return leaseRatePerMonth;
    	}	
}
