package com.spring.resto.resto.security.controller;

import java.util.Map;

import javax.validation.Valid;

import com.spring.resto.resto.security.entity.Login;
import com.spring.resto.resto.security.service.JWTService;
import com.spring.resto.resto.security.service.UserAuthenticateService;

public class LoginController implements TokenController{
	
	private UserAuthenticateService userAuthenticateService;
	private JWTService jwtService;
	
	
	public LoginController(UserAuthenticateService userAuthenticateService, JWTService jwtService) {
		super();
		this.userAuthenticateService = userAuthenticateService;
		this.jwtService = jwtService;
	}


	@Override
	public Map<String,String> login(@Valid Login login) {
		// TODO Auto-generated method stub
		
		Long start = System.currentTimeMillis();
		
		System.out.println(login.getUserName());
		
		Map<String,String> tokens = this.userAuthenticateService.login(login.getUserName(), login.getPassword());
		
		return tokens;
	}

}
