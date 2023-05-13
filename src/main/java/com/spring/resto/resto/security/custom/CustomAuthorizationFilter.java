package com.spring.resto.resto.security.custom;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.resto.resto.security.service.utils.JwtTokenUtils;

import io.jsonwebtoken.ExpiredJwtException;

//CLASE QUE CUSTOMIZA LA AUTORIZACION
public class CustomAuthorizationFilter extends OncePerRequestFilter{
	
	public static final String BEARER_TOKEN_PREFIX = "Bearer ";
	
	
	private ObjectMapper objectMapper;
	private JwtTokenUtils jwtTokenUtil;
	private UserDetailsService userDetailsService;
	private String basePath;
	private String loginPath;
	private String refeshTokenPath;
	
	public CustomAuthorizationFilter(ObjectMapper objectMapper, JwtTokenUtils jwtTokenUtil,
			UserDetailsService userDetailsService, String basePath, String loginPath, String refeshTokenPath) {
		super();
		this.objectMapper = objectMapper;
		this.jwtTokenUtil = jwtTokenUtil;
		this.userDetailsService = userDetailsService;
		this.basePath = basePath;
		this.loginPath = loginPath;
		this.refeshTokenPath = refeshTokenPath;
	}


	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(!request.getServletPath().equals(this.basePath + this.loginPath) && !request.getServletPath().equals(this.basePath + this.refeshTokenPath)) {
			String userName = null;
			String jwtToken = null;
			
			//TRAEMOS EL VALOR DEL HEADER, ENVIADA DESDE FRONT
			String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
			
			//SI EL HEADER NO ESTA VACIO Y ESTE EMPIEZA CON EL PREFIJO Bearer
			if(authHeader != null && authHeader.startsWith(BEARER_TOKEN_PREFIX)) {
				//RETIRAMOS EL PREFIJO Bearer Y DEJAMOS SOLO EL TOKEN
				jwtToken = authHeader.substring(BEARER_TOKEN_PREFIX.length());
				try {
					//VALIDAMOS QUE EL TOKEN PASADO ES VALIDO
					userName = validateToken(jwtToken);
				}catch(RuntimeException e) {
					exceptionResponse(response,e);
				}
			}
			
			//AUTENTICAMOS AL USUARIO QUE POSEE EL TOKEN
			authenticateUserName(request,userName,jwtToken);
		}
		filterChain.doFilter(request, response);
		
	}
	
	private void exceptionResponse(HttpServletResponse response, RuntimeException ex)
			throws IOException, StreamWriteException, DatabindException {
		response.setHeader("error", ex.getMessage());
		response.setStatus(HttpStatus.FORBIDDEN.value());
		Map<String, String> error = new HashMap<>();
		error.put("error_message", ex.getMessage());
		response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		objectMapper.writeValue(response.getOutputStream(), error);
	}
	
	//VALIDAMOS EL TOKEN GENERADO
	private String validateToken(final String token) {
		String userName = null;
		try {
			userName = this.jwtTokenUtil.getUserNameFromToken(token);
		}catch(IllegalArgumentException e) {
			throw new RuntimeException(e);
		}catch(ExpiredJwtException e) {
			throw new RuntimeException();
		}
		//RETORNAMOS EL NOMBVRE DE USUARIO
		return userName;
	}
	
	//AUTENTICACION DEL USUARIO
	private void authenticateUserName(HttpServletRequest request, String userName, String jwtToken) {
		if(userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			//LOGEAMOS CON EL NOMBRE DE USUARIO
			UserDetails userDetails = this.userDetailsService.loadUserByUsername(userName);
			
			if(this.jwtTokenUtil.validateToken(jwtToken, userDetails)) {
				
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
				usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			
			}
		}
	}
}
