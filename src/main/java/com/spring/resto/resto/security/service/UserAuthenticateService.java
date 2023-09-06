package com.spring.resto.resto.security.service;

import java.util.Map;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserAuthenticateService {
	
	private JWTService jwtService;
	private PasswordEncoder passwordEncoder;
	private UserDetailsService userDetailsService;
	
	public UserAuthenticateService(JWTService jwtService, PasswordEncoder passwordEncoder,
			UserDetailsService userDetailsService) {
		super();
		this.jwtService = jwtService;
		this.passwordEncoder = passwordEncoder;
		this.userDetailsService = userDetailsService;
	}
	
	//CREAMOS LA FUNCION DE LOGEO
	public Map<String,String>login(String userName,String Password){
		UserDetails optUser = this.userDetailsService.loadUserByUsername(userName);
		
		
		//SI LAS CLAVES NO SON IGUALES, TIRAMOS UNA EXCEPCION
		if(!this.passwordEncoder.matches(Password, optUser.getPassword())) {
			System.out.println(Password);
			throw new RuntimeException("las claves no son iguales");
		}
		
		User user = (User)optUser;
		
		//LLAMAMOS AL SERVICIO DE TOKNES Y GENERAMOS UNO
		Map<String,String> tokens = this.jwtService.generateTokenSet(user);
		return tokens;
	}
	
}
