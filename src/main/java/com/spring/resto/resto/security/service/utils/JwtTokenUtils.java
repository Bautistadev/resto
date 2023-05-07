package com.spring.resto.resto.security.service.utils;

import java.io.Serializable;

public class JwtTokenUtils implements Serializable{

	private static final long serialVersionUID = -2550185165626007488L;
	
	//TIEMPO DE VALIDACION DEL TOKEN
	public static final long JWT_TOKEN_VALIDITY = 30*60*60*100;
	
	//TIMEPO DE ACTUALIZACION DEL TOKEN
	public static final long JWT_REFRESH_TOKEN_VALIDITY = 4*60*60*1000;
	
	private String secret;
	
	
}
