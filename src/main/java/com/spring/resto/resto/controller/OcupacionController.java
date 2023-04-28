package com.spring.resto.resto.controller;

import java.util.List;

import javax.validation.Valid;

import com.spring.resto.resto.DTO.OcupacionDTO;
import com.spring.resto.resto.DTO.OcupacionRequestDTO;
import com.spring.resto.resto.controller.delegate.OcupacionApiDelegate;
import com.spring.resto.resto.service.OcupacionService;

public class OcupacionController implements OcupacionApiDelegate{
	
	private OcupacionService ocupacionService;
	
	public OcupacionController(OcupacionService ocupacionService) {
		this.ocupacionService = ocupacionService;
	}

	@Override
	public OcupacionDTO create(@Valid OcupacionRequestDTO request) {
		// TODO Auto-generated method stub
		return this.ocupacionService.create(request);
	}

	@Override
	public OcupacionDTO update(@Valid OcupacionDTO request) {
		// TODO Auto-generated method stub
		return this.ocupacionService.update(request);
	}

	@Override
	public OcupacionDTO retrive(Long id) {
		// TODO Auto-generated method stub
		return this.ocupacionService.retrive(id);
	}

	@Override
	public List<OcupacionDTO> retriveAll() {
		// TODO Auto-generated method stub
		return this.ocupacionService.retriveAll();
	}

}
