package com.spring.resto.resto.controller;

import java.util.List;

import javax.validation.Valid;

import com.spring.resto.resto.DTO.EmpleadoDTO;
import com.spring.resto.resto.DTO.EmpleadoRequestDTO;
import com.spring.resto.resto.controller.delegate.EmpleadoApiDelegate;
import com.spring.resto.resto.service.EmpleadoService;

public class EmpleadoController implements EmpleadoApiDelegate {
	
	private EmpleadoService empleadoService;

	public EmpleadoController(EmpleadoService empleadoService) {
		super();
		this.empleadoService = empleadoService;
	}

	@Override
	public EmpleadoDTO create(@Valid EmpleadoRequestDTO empleadoDTO) {
		// TODO Auto-generated method stub
		return this.empleadoService.create(empleadoDTO);
	}

	@Override
	public EmpleadoDTO update(@Valid EmpleadoDTO empleadoDTO) {
		// TODO Auto-generated method stub
		return this.empleadoService.update(empleadoDTO);
	}

	@Override
	public EmpleadoDTO retrive(Long id) {
		// TODO Auto-generated method stub
		return this.empleadoService.retrive(id);
	}

	@Override
	public List<EmpleadoDTO> retriveAll() {
		// TODO Auto-generated method stub
		return this.empleadoService.retriveAll();
	}

}
