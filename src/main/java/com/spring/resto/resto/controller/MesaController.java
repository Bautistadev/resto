package com.spring.resto.resto.controller;

import java.util.List;

import javax.validation.Valid;

import com.spring.resto.resto.DTO.MesaDTO;
import com.spring.resto.resto.DTO.MesaRequestDTO;
import com.spring.resto.resto.controller.delegate.MesaApiDelegate;
import com.spring.resto.resto.service.MesaService;


public class MesaController implements MesaApiDelegate {
	
	private MesaService mesaService;

	public MesaController(MesaService mesaService) {
		super();
		this.mesaService = mesaService;
	}

	@Override
	public MesaDTO create(@Valid MesaRequestDTO requestDTO) {

		// TODO Auto-generated method stub
		return this.mesaService.create(requestDTO);
	}

	@Override
	public MesaDTO update(@Valid MesaDTO requestDTO) {
		// TODO Auto-generated method stub
		return this.mesaService.update(requestDTO);
	}

	@Override
	public MesaDTO retrive(Long id) {
		// TODO Auto-generated method stub
		return this.mesaService.retrive(id);
	}

	@Override
	public List<MesaDTO> retriveAll() {
		// TODO Auto-generated method stub
		return this.mesaService.retriveAll();
	}

}
