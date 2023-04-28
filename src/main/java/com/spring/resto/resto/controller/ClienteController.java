package com.spring.resto.resto.controller;

import java.util.List;

import javax.validation.Valid;

import com.spring.resto.resto.DTO.ClienteDTO;
import com.spring.resto.resto.DTO.ClienteRequestDTO;
import com.spring.resto.resto.controller.delegate.ClienteApiDelegate;
import com.spring.resto.resto.service.ClienteService;

public class ClienteController implements ClienteApiDelegate{
	
	private ClienteService clienteService;

	public ClienteController(ClienteService clienteService) {
		super();
		this.clienteService = clienteService;
	}

	@Override
	public ClienteDTO create(@Valid ClienteRequestDTO requestDTO) {
		// TODO Auto-generated method stub
		return this.clienteService.create(requestDTO);
	}

	@Override
	public ClienteDTO update(@Valid ClienteDTO requestDTO) {
		// TODO Auto-generated method stub
		return this.clienteService.update(requestDTO);
	}

	@Override
	public ClienteDTO retrive(Long id) {
		// TODO Auto-generated method stub
		return this.clienteService.retrive(id);
	}

	@Override
	public List<ClienteDTO> retriveAll() {
		// TODO Auto-generated method stub
		return this.clienteService.retriveAll();
	}

}
