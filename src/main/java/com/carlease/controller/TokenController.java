package com.carlease.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carlease.domain.Token;
import com.carlease.domain.TokenRequestData;
import com.carlease.service.Authenticator;
import com.carlease.service.JWTHelper;
import com.carlease.service.JWTUtil;

/**
 * All operations with a token will be routed by this controller.
 * @author Akanksha Padhi
 * 
 */
@Controller
@RequestMapping("/token")
public class TokenController {

	JWTUtil jwtUtil = new JWTHelper();
	
	/**
	 * 
	 * @param tokenRequestData takes username, password and scope as input
	 * @return unique token for each user
	 */
	@PostMapping(consumes = "application/json")
	public ResponseEntity<?> getToken(@RequestBody TokenRequestData tokenRequestData) {
		
		String username = tokenRequestData.getUsername();
		String password = tokenRequestData.getPassword();
		String scopes = tokenRequestData.getScopes();
		
		if (username != null && username.length() > 0 
				&& password != null && password.length() > 0 
				&& Authenticator.checkPassword(username, password)) {
			Token token = jwtUtil.createToken(scopes);
			ResponseEntity<?> response = ResponseEntity.ok(token);
			return response;			
		}
		// bad request
		return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		
	}
}