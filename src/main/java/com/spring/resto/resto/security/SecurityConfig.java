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
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.resto.resto.security.custom.CustomAuthorizationFilter;
import com.spring.resto.resto.security.service.utils.JwtTokenUtils;


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
		http.cors().and().csrf().disable();
	    http.authorizeRequests().antMatchers(basePath + "/security/**").permitAll();
	    http.authorizeRequests().antMatchers(basePath + "/Empleado/**").permitAll();
	    http.authorizeRequests().antMatchers(basePath+"/Plato/**").permitAll();
	    http.authorizeRequests().antMatchers(basePath+"/Cliente/**").permitAll();
	    http.authorizeRequests().antMatchers(basePath+"/Hora/**").permitAll();
	    http.authorizeRequests().antMatchers(basePath+"/Geolocalizacion/update").hasAnyAuthority("ROLE_ADMIN");
	    http.authorizeRequests().antMatchers(basePath+"/Geolocalizacion/add").hasAnyAuthority("ROLE_ADMIN");
	    http.authorizeRequests().antMatchers(basePath+"/Geolocalizacion/retriveAll").permitAll();
	    http.authorizeRequests().antMatchers("/swagger-ui/**").permitAll();
	    http.authorizeRequests().antMatchers("/v3/api-docs").permitAll();
	    http.authorizeRequests().anyRequest().permitAll();
	    http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	    //APLICAMOS EL FILTRO ANTERIORMEENTE CONFIGURADO
	    http.addFilterBefore(customAuthorizationFilter, UsernamePasswordAuthenticationFilter.class);
		return http.build();
	 }
	
	@Bean
    public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:8100/").allowedMethods("*");
			}
		};
    	
    }



 }
