package com.spring.resto.resto.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.resto.resto.security.custom.CustomAuthorizationFilter;
import com.spring.resto.resto.security.service.utils.JwtTokenUtils;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean 
	public JwtTokenUtils getJwtTokenUtils(@Value("${jwt.secret}") String secret) {
		return new JwtTokenUtils(secret);
	}
	
	//CREAMOS EL BEAN DE CUSTOMIZACION PARA EL FILTRO DE AUTORIZACION
	@Bean
	public CustomAuthorizationFilter getCustomAuthorizationFilter(ObjectMapper objectMapper,
			PasswordEncoder encoder,UserDetailsService userDetailsService,JwtTokenUtils jwtTokenUtils,
			@Value("${api.basePath}") String basePath, @Value("${api.loginPath}") String loginPath,
    		@Value("${api.refreshTokenPath}") String refreshTokenPath) {
				
		
		return new CustomAuthorizationFilter(objectMapper, jwtTokenUtils, userDetailsService, basePath, loginPath, 
    			refreshTokenPath);
		
	}
	
	//CREAMOS EL FILTRO DE SEGURIDAD 
	@Bean
	public SecurityFilterChain getSecurityFilterChain(HttpSecurity http, CustomAuthorizationFilter customAuthorizationFilter,
			@Value("${api.basePath}") String basePath) throws Exception {
		http.csrf().disable();
	    http.authorizeRequests().antMatchers(basePath + "/security/login").permitAll();
	    http.authorizeRequests().antMatchers(basePath+"/PlatoApi/**").hasAnyAuthority("ROLE_ADMIN","ROLE_USER");
	    http.authorizeRequests().antMatchers(basePath+"/Cliente/**").hasAnyRole("ADMIN");
	    http.authorizeRequests().antMatchers("/swagger-ui/**").permitAll();
	    http.authorizeRequests().antMatchers("/v3/api-docs").permitAll();
	    http.authorizeRequests().anyRequest().permitAll();
	    http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	    http.addFilterBefore(customAuthorizationFilter, UsernamePasswordAuthenticationFilter.class);
		return http.build();
	 }
	



 }
