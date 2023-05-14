package com.spring.resto.resto.security.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.spring.resto.resto.entity.Empleado;
import com.spring.resto.resto.repository.EmpleadoRepository;

public class UserDetailsServiceImplements implements UserDetailsService{

	private EmpleadoRepository empleadoRepository;
	
	
	public UserDetailsServiceImplements(EmpleadoRepository empleadoRepository) {
		super();
		this.empleadoRepository = empleadoRepository;
	}

	//LOGEAMOS POR MEDIO DEL NOMBRE DE USUARIO
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		//BUSCAMOS AL EMPLEADO EN AL BASE DE DATOS
		Empleado empleado = findByUserName(username);
		Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(empleado.getRol().getRol().name()));
		UserDetails userDetails = new User(empleado.getUserName(),empleado.getPassword(),authorities);
		return userDetails;
	}
	
	private Empleado findByUserName(final String userName) {
		//BUSCAMOS AL EMPLEADO MEDIANTE SU NOMBRE DE USUARIO
		Optional<Empleado> optEmpleado = this.empleadoRepository.findByUserName(userName);
		
		System.out.println("USUARIO: "+ userName);
		
		if(optEmpleado.isEmpty()) {
			throw new RuntimeException("usuario no registrado");
		}
		return optEmpleado.get();
	}
}
