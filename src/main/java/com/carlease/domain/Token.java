package com.carlease.domain;

/**
 * basic token methods
 * @author Akanksha Padhi
 */
public class Token {
	String token;
	
	/**
	 * 
	 * @param token is parsed
	 */
	public Token(String token) {
		super();
		this.token = token;
	}
	
	/**
	 * 
	 * @return token
	 */
	public String getToken() {
		return token;
	}
	
	/**
	 * 
	 * @param token is input
	 */
	public void setToken(String token) {
		this.token = token;
	}
}
