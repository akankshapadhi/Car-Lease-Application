package com.carlease.service;

/**
 * Helps to authenticate brokers
 * @author Akanksha Padhi
 */
public class Authenticator {
	
	/**
	 * 
	 * @param username for broker and lease employee
	 * @return boolean
	 */
	public static boolean checkUser(String username) {
		if( (username != null && username.length() > 0) &&
			( username.equalsIgnoreCase("john") 
		    || username.equalsIgnoreCase("susan"))) {
			return true;
		}else {
			return false;
		}
	}
	
/**
 * 
 * @param username for broker and lease employee 
 * @param password for broker and lease employee 
 * @return boolean
 */
	public static boolean checkPassword(String username, String password) {
		if(checkUser(username)) {
			if(username.equalsIgnoreCase("john") && password.equals("pass")) {
				return true;
			}
			if(username.equalsIgnoreCase("susan") && password.equals("pass")) {
				return true;
			}			
		}else {
			return false;
		}
		return false;
	}

}
