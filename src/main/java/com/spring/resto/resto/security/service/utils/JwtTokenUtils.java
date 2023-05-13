package com.spring.resto.resto.security.service.utils;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtTokenUtils implements Serializable{

	private static final long serialVersionUID = -2550185165626007488L;
	
	//TIEMPO DE VALIDACION DEL TOKEN
	public static final long JWT_TOKEN_VALIDITY = 30*60*60*100;
	
	//TIMEPO DE ACTUALIZACION DEL TOKEN
	public static final long JWT_REFRESH_TOKEN_VALIDITY = 4*60*60*1000;
	
	//CLAVE SECRETA
	private String secret;

	//CONSTRUCTOR DE LA CLASE
	public JwtTokenUtils(final String secret) {
		super();
		this.secret = secret;
	}
	
	///---------------FUNCIONES Y PROCEDIMIENTOS DE INTERACCION,CREACION Y ACTUALIZACION DE LOS TOKENS ----------------------
	
	
	/*
	 * Como se forma un Token
	 * 
	 * Estos se encuentran formado mediante una combinacion de claims,
	 * 			--> fecha de emision
	 * 			--> fecha de expiracion
	 * 			--> sujeto
	 * 			--> fecha de inicio de validez
	 * 
	 * */
	
	
	
	
	//A PARTIR DEL TOKEN, DAME EL NOMBRE DE USUARIO (EL SUJETO)
	public String getUserNameFromToken(String token) {
		return this.getClaimFromToken(token, Claims::getSubject);
	}
	
	//A PARTIR DEL TOKEN, DAME LA FECHA DE EMISION
	public Date getIssuedAtDateFromToken(String token) {
		return this.getClaimFromToken(token, Claims::getIssuedAt);
	}
	
	//A PARTIR DEL TOKEN, DAME LA FECHA DE EXPIRACION
	public Date getExpirationDateFromToken(String token) {
		return this.getClaimFromToken(token, Claims::getExpiration);
	}
	
	
	//PARA EL TOKEN, EL NOMBRE DEL USUARIO ES UNA CLAIM: "ATRIBUTO QUE DEFINE LA ENTIDAD EL CUAL VA A SER USO DEL TOKEN"
	public <Token> Token getClaimFromToken(String token,Function<Claims,Token>claimsResolver) {
		
		//TRAEMOS TODOS LAS CLAIMS DEL TOKEN
		final Claims  claims = Jwts.parser()
								   .setSigningKey(this.secret) //INGRESAMOS LA CLAVE SECRETA
								   .parseClaimsJws(token)
								   .getBody();
		//RETORNAMOS LAS CLAIMS
		return claimsResolver.apply(claims);
	}
	
	//FUNCION QUE DEVUELVE SI EL TOKEN EXPIRO
	private boolean isTokenExpired(String token) {
		final Date expiration = this.getExpirationDateFromToken(token);
		return expiration.before(new Date());
	}
	
	//FUNCION QUE IGNORA LA FECHA DE EXPIRACION DEL TOKEN
	private boolean ignoredTokenExpired(String token) {
		
		//EN ESTA FUNCION PUEDES ESPECIFICAR POR QUE PUEDE UN TOKEN SER IGNORADO
		
		return false;
	}
	
	/**
	 * 
		La clase UserDetails en Java es parte del framework de seguridad Spring Security y 
		se utiliza para representar los detalles de un usuario en el contexto de la autenticación 
		y autorización. Proporciona información como el nombre de usuario, la contraseña, los roles 
		y los privilegios asociados a un usuario.
	 * */
	
	//FUNCION QUE GENERA EL TOKEN CON TIEMPO DE EXPIRACION
	public String generateToken(UserDetails userDetails, long ExpireTime) {
		
		//COMO ES LA PRIMERA GENERACION DE TOKEN, EL MAPA ESTA VACIO
		Map<String , Object> claims = new HashMap<>();
		return this.doGenerateToken(claims, secret, ExpireTime);
	}
	//FUNCION QUE GENERA EL TOKEN SIN TIEMPO DE EXPIRACION
	public String generateToken(UserDetails userDetails) {
		//COMO ES LA PRIMERA GENERACION DE TOKEN, EL MAPA ESTA VACIO Y ADEMAS ESTE TOKEN NO YIENE FECHA DE EXPIRACION
		Map<String , Object> claims = new HashMap<>();
		return this.doGenerateToken(claims, secret, null);
	}
	//FUNCION QUE GENERA UN TOKEN CUANDO SE DEBE REFRESCAR OTRO QUE EXPIRO
	public String generateToken(UserDetails userDetails, Map<String,Object> claims, long ExpireTime) {
		return this.doGenerateToken(claims, secret, ExpireTime);
	}
	
	
	private String doGenerateToken(Map<String,Object> claims, String subject, Long ExpireTime) {
	
		JwtBuilder Token = Jwts.builder();	//INICIAMOS LA CONSTRUCCION DEL TOKEN
		
		Token.setClaims(claims);//SETEAMOS LA CLAIMS
		
		Token.setSubject(subject);//SETEAMOS EL SUJETO]
		
		Token.setIssuedAt(new Date(System.currentTimeMillis())); //SETEAMOS LA FECHA DE EMISION
		
		if(ExpireTime != null) // SI HAY FECHA DE EXPIRACION
			Token.setExpiration(new Date(System.currentTimeMillis()+ExpireTime));//SETEAMOS LA FECHA DE EXPIRACION
		
		Token.signWith(SignatureAlgorithm.HS512, secret);//SETEAMOS EL ALGORITMO DE GENERACION ELEGIDO
		
		return Token.compact();//COMPACTAMOS LOS DATOS EN UN TOKEN Y LO RETORNAMOS
		
	}
	
	//PUEDE EL TOKEN ACTUALIZARCE
	public Boolean canTokenBeRefreshed(String token) {
		return (!this.isTokenExpired(token) || this.ignoredTokenExpired(token));
	}
	
	public Boolean validateToken(String token,UserDetails userDetails) {
		final String userName = this.getUserNameFromToken(token);
		//SI EL TOKEN NO ESTA EXPIRADO Y EL NOMBRE DE USUAIRO ES IGUAL AL DEL CLAIM DEL TOKEN
		return (userName.equals(userDetails.getUsername()) && this.isTokenExpired(token));
	}
	
}
