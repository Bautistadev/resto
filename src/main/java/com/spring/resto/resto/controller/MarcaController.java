package com.spring.resto.resto.controller;

import java.util.List;

import javax.validation.Valid;

import com.spring.resto.resto.DTO.MarcaDTO;
import com.spring.resto.resto.DTO.MarcaRequestDTO;
import com.spring.resto.resto.controller.delegate.MarcaApiDelegate;
import com.spring.resto.resto.service.MarcaService;

public class MarcaController implements MarcaApiDelegate {
	
	
	private MarcaService marcaService;

	public MarcaController(MarcaService marcaService) {
		super();
		this.marcaService = marcaService;
	}

	@Override
	public MarcaDTO create(@Valid MarcaRequestDTO requestDTO) {
		// TODO Auto-generated method stub
		return marcaService.create(requestDTO);
	}

	@Override
	public MarcaDTO update(@Valid MarcaDTO requestDTO) {
		// TODO Auto-generated method stub
		return marcaService.update(requestDTO);
	}

	@Override
	public List<MarcaDTO> retriveAll() {
		// TODO Auto-generated method stub
		return marcaService.retriveAll();
	}

	@Override
	public MarcaDTO retrive(Long id) {
		// TODO Auto-generated method stub
		return marcaService.retrive(id);
	}
	
	
}
