package com.carlease.service;

import com.carlease.domain.Token;

/**
 * Service that manages Token entities
 * @author Akanksha Padhi
 */
public interface JWTUtil {
	
	/**
	 * 
	 * @param jwt_token is parsed
	 * @return boolean
	 */
	public boolean verifyToken(String jwt_token);
	
	/**
	 * 
	 * @param jwt_token is parsed
	 * @return scope of user
	 */
	public String getScopes(String jwt_token) ;
	
	/**
	 * 
	 * @param scopes is parsed
	 * @return token
	 */
	public Token createToken(String scopes) ;
}