package com.spring.resto.resto.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.spring.resto.resto.DTO.ClienteDTO;
import com.spring.resto.resto.DTO.ClienteRequestDTO;
import com.spring.resto.resto.entity.Cliente;
import com.spring.resto.resto.repository.ClienteRepository;
import com.spring.resto.resto.service.mapper.ClienteMapper;

public class ClienteService {
	
	private ClienteMapper clienteMapper;
	private ClienteRepository clienteRepository;
	
	public ClienteService(ClienteMapper clienteMapper, ClienteRepository clienteRepository) {
		super();
		this.clienteMapper = clienteMapper;
		this.clienteRepository = clienteRepository;
	}
	
	public ClienteDTO create (ClienteRequestDTO requestDTO) {
		
		Cliente cliente = this.clienteMapper.map(requestDTO);
		
		this.clienteRepository.save(cliente);
		
		return this.clienteMapper.map(cliente);
	}
	
	public ClienteDTO update(ClienteDTO requestDTO) {
		
		Cliente cliente = this.clienteMapper.map(requestDTO);
		
		this.clienteRepository.save(cliente);
		
		return this.clienteMapper.map(cliente);
	}
	
	public ClienteDTO retrive(Long id) {
		
		Cliente cliente = this.clienteRepository.findById(id).get();
		
		return this.clienteMapper.map(cliente);
	}
	
	public List<ClienteDTO>retriveAll(){
		
		Iterable<Cliente> clienteIterable = this.clienteRepository.findAll();
		Iterator<Cliente> clienteIterator = clienteIterable.iterator();
		List<ClienteDTO> listaCliente = new ArrayList<>();
		
		while(clienteIterator.hasNext())
			listaCliente.add(this.clienteMapper.map(clienteIterator.next()));
		
		return listaCliente;
	}
	
}
