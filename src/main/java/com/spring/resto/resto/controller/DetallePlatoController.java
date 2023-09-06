package com.spring.resto.resto.controller;

import java.util.List;

import javax.validation.Valid;

import com.spring.resto.resto.DTO.DetallePlatoDTO;
import com.spring.resto.resto.DTO.DetallePlatoRequestDTO;
import com.spring.resto.resto.controller.delegate.DetallePlatoApiDelegate;
import com.spring.resto.resto.entity.DetallePlato;
import com.spring.resto.resto.service.DetallePlatoService;

public class DetallePlatoController implements DetallePlatoApiDelegate{

	private DetallePlatoService detallePlatoService;
	
	public DetallePlatoController(DetallePlatoService detallePlatoService) {
		super();
		this.detallePlatoService = detallePlatoService;
	}

	@Override
	public DetallePlato create(@Valid DetallePlatoRequestDTO requestDTO) {
		// TODO Auto-generated method stub
		return this.detallePlatoService.create(requestDTO);
	}

	@Override
	public DetallePlatoDTO update(@Valid DetallePlatoDTO requestDTO) {
		// TODO Auto-generated method stub
		return this.detallePlatoService.update(requestDTO);
	}

	@Override
	public DetallePlatoDTO retrive(Long id) {
		// TODO Auto-generated method stub
		return this.detallePlatoService.retrive(id);
	}

	@Override
	public List<DetallePlatoDTO> retriveAll() {
		// TODO Auto-generated method stub
		return this.detallePlatoService.retriveAll();
	}

}
