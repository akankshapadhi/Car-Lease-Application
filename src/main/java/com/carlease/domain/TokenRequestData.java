package com.carlease.domain;

/**
 * token basic attributes
 * @author Akanksha Padhi
 */
public class TokenRequestData {
	String username;
	String password;
	String scopes;
	
	/**
	 * 
	 * @param username is parsed
	 * @param password is parsed
	 * @param scopes is parsed
	 */
	public TokenRequestData(String username, String password, String scopes) {
		super();
		this.username = username;
		this.password = password;
		this.scopes = scopes;
	}
	
	/**
	 * 
	 * @return username of user
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * 
	 * @param username is input
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * 
	 * @return password of user
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * 
	 * @param password of user parsed
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 
	 * @return scope
	 */
	public String getScopes() {
		return scopes;
	}
	
	/**
	 * 
	 * @param scopes parsed
	 */
	public void setScopes(String scopes) {
		this.scopes = scopes;
	}	
	
}

