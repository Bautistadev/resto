package com.spring.resto.resto.security.service;

import java.util.List;

import com.spring.resto.resto.security.Repository.RolRepository;
import com.spring.resto.resto.security.entity.Rol;

public class RolService {
	
	private RolRepository rolRepository;

	public RolService(RolRepository rolRepository) {
		super();
		this.rolRepository = rolRepository;
	}
	
	public List<Rol> getAllRoles() {
		return this.rolRepository.findAll();
	}
	
	public Rol getAdminRol() {
		return this.rolRepository.findById(1L).get();
	}
	
	public Rol getEmpleadoRol() {
		return this.rolRepository.findById(2L).get();
	}
}
