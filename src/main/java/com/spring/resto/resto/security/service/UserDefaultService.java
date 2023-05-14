package com.spring.resto.resto.security.service;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.spring.resto.resto.entity.*;
import com.spring.resto.resto.repository.EmpleadoRepository;
import com.spring.resto.resto.repository.*;



public class UserDefaultService {

	private EmpleadoRepository empleadoRepository;
	private RolService roleService;
	private PasswordEncoder encoder;
	
	
	@Value("${api.defaultuser.username}")
	private String userName;
	
	@Value("${api.defaultuser.nombre}")
	private String nombre;
	
	@Value("${api.defaultuser.apellido}")
	private String apellido;
	
	@Value("${api.defaultuser.dni}")
	private Integer dni;
	
	@Value("${api.defaultuser.password}")
	private String password;

	public UserDefaultService(EmpleadoRepository empleadoRepository, PasswordEncoder encoder,RolService roleService) {
		super();
		this.empleadoRepository = empleadoRepository;
		this.encoder = encoder;
		this.roleService = roleService;
	}
	
	public void createDefaultAdminUser() {
		if(this.empleadoRepository.count() == 0) {
			Empleado empleadoAdmin = new Empleado();
			empleadoAdmin.setUserName(userName);
			empleadoAdmin.setPassword(encoder.encode(password));
			empleadoAdmin.setNombre(nombre);
			empleadoAdmin.setApellido(apellido);
			empleadoAdmin.setDni(dni);
			empleadoAdmin.setRol(this.roleService.getAdminRol());
			
			this.empleadoRepository.save(empleadoAdmin);
			
		}
	}
	
}
