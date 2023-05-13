package com.spring.resto.resto.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.spring.resto.resto.repository.EmpleadoRepository;
import com.spring.resto.resto.security.service.JWTService;
import com.spring.resto.resto.security.service.UserAuthenticateService;
import com.spring.resto.resto.security.service.UserDetailsServiceImplements;
import com.spring.resto.resto.security.service.utils.JwtTokenUtils;

@Configuration
public class SecurityAppConfig {
	
	
	@Bean 
	public JWTService getJWTService(UserDetailsService userDetailsService, JwtTokenUtils jwtTokenUtils) {
		return new JWTService(jwtTokenUtils,userDetailsService);
	}
	
	@Bean
	public UserAuthenticateService getUserAuthenticationService(PasswordEncoder passwordEncoder,
			JWTService jwtService, UserDetailsService userDetailsService) {
		return new UserAuthenticateService(jwtService, passwordEncoder, userDetailsService);
	}
	
	@Bean
	public UserDetailsService getUserDetailService(EmpleadoRepository EmpleadoRepository) {
		return new UserDetailsServiceImplements(EmpleadoRepository);
	}
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
