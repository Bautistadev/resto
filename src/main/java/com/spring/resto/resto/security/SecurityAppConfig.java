package com.spring.resto.resto.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.spring.resto.resto.repository.EmpleadoRepository;
import com.spring.resto.resto.security.Repository.RolRepository;
import com.spring.resto.resto.security.controller.LoginController;
import com.spring.resto.resto.security.controller.TokenController;
import com.spring.resto.resto.security.service.JWTService;
import com.spring.resto.resto.security.service.RolService;
import com.spring.resto.resto.security.service.UserAuthenticateService;
import com.spring.resto.resto.security.service.UserDefaultService;
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
	public TokenController getLogin( UserAuthenticateService userAuthenticateService,JWTService jwtService) {
		return new LoginController(userAuthenticateService,jwtService);
	}
	@Bean
	public UserDefaultService getUserInitializationService(PasswordEncoder passwordEncoder, 
			EmpleadoRepository userRepository,RolService roleService) {
		return new UserDefaultService(userRepository, passwordEncoder,roleService);
	}
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Bean 
	public RolService rolService(RolRepository rolRepository) {
		return new RolService(rolRepository);
	}

}
