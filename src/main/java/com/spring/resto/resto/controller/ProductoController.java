package com.spring.resto.resto.controller;

import java.util.List;

import javax.validation.Valid;

import com.spring.resto.resto.DTO.BebidaDTO;
import com.spring.resto.resto.DTO.BebidaRequestDTO;
import com.spring.resto.resto.DTO.PlatoDTO;
import com.spring.resto.resto.DTO.PlatoRequestDTO;
import com.spring.resto.resto.controller.delegate.BebidaApiDelegate;
import com.spring.resto.resto.controller.delegate.PlatoApiDelegate;
import com.spring.resto.resto.service.BebidaService;
import com.spring.resto.resto.service.PlatoService;



public class ProductoController implements PlatoApiDelegate,BebidaApiDelegate {
	
	private PlatoService platoService;
	private BebidaService bebidaService;
		
	
	public ProductoController(PlatoService platoService,BebidaService bebidaService) {
		super();
		this.platoService = platoService;
		this.bebidaService = bebidaService;
	}
	
	
	//LISTADO COMPLETO
	@Override
	public List<PlatoDTO> retriveAllPlato() {
		// TODO Auto-generated method stub
		return platoService.retriveAll();
	}
	

	@Override
	public PlatoDTO retrivePlato(Long id) {
		// TODO Auto-generated method stub
		return platoService.retrive(id);
	}


	@Override
	public PlatoDTO createPlato(PlatoRequestDTO requestDTO) {
		// TODO Auto-generated method stub
		
		return platoService.create(requestDTO);
	}


	@Override
	public PlatoDTO updatePlato(PlatoDTO requestDTO) {
		// TODO Auto-generated method stub
		return platoService.update(requestDTO);
	}


	@Override
	public String removePlato(PlatoDTO requestDTO) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<BebidaDTO> retriveAllBebida() {
		// TODO Auto-generated method stub
		return bebidaService.retriveAll();
	}


	@Override
	public BebidaDTO retriveBebida(Long id) {
		// TODO Auto-generated method stub
		return bebidaService.retrive(id);
	}


	@Override
	public BebidaDTO createBebida(@Valid BebidaRequestDTO requestDTP) {
		// TODO Auto-generated method stub
		return bebidaService.create(requestDTP);
	}


	@Override
	public BebidaDTO updateBebida(@Valid BebidaDTO requestDTO) {
		// TODO Auto-generated method stub
		return bebidaService.update(requestDTO);
	}


	@Override
	public String removeBebida(@Valid BebidaDTO requestDTO) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
