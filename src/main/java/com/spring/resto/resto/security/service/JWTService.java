package com.spring.resto.resto.security.service;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.spring.resto.resto.security.service.utils.JwtTokenUtils;

public class JWTService {
	
	public static final String ACCESS_TOKEN_HEADER = "access_token";
	public static final String REFRESH_TOKEN_HEADER = "refresh_token";
	
	private JwtTokenUtils jwtTokenUtil;
	private UserDetailsService userDeatilsService;
	
	public JWTService(JwtTokenUtils jwtTokenUtil, UserDetailsService userDeatilsService) {
		super();
		this.jwtTokenUtil = jwtTokenUtil;
		this.userDeatilsService = userDeatilsService;
	}
	
	//SERVICIO DE GENERACION DE TOKEN
	public Map<String,String>generateTokenSet(UserDetails user){
		//ATRIBUTOS PARA LA GENERACION DE LOS TOKENS
		Map<String,Object> claims = new HashMap<>();
		//AGREGAMOS EL TIPO DE ROLE DE AUTORIDAD QUE TIENE EL USUARIO
		claims.put("roles", user.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()));
		//GENERAMOS EL TOKENS
		String token = this.jwtTokenUtil.generateToken(user,claims,JwtTokenUtils.JWT_TOKEN_VALIDITY);
		String refreshToken = this.jwtTokenUtil.generateToken(user,new HashMap<>(),JwtTokenUtils.JWT_REFRESH_TOKEN_VALIDITY);
		
		//ESTA ES LA LISTA QUE ALMACENA LOS TOKENS EN MEMORIA
		Map<String,String>tokens = new HashMap<>();
		
		//AGREGAMOS A LA LISTA EL TIPO DE TOKEN(ACCESO O ACTUALIZACION) Y LO AGREGAMOS A LA LISTA
		tokens.put(ACCESS_TOKEN_HEADER, token);
		tokens.put(REFRESH_TOKEN_HEADER,token);
		
		return tokens;
	
	}
	
	//SERVICIO DE VALIDACION DE TOKEN REFRESCADOS
	public Map<String,String>validateRefreshToken(String refreshToken){
		
		//CAPTURAMOS EL NOMBRE DE USUARIO DEL TOKEN
		String userName = this.jwtTokenUtil.getUserNameFromToken(refreshToken);
		UserDetails user = this.userDeatilsService.loadUserByUsername(userName);
		Map<String,String> tokens = this.generateTokenSet(user);
		
		return tokens;
	}
}
