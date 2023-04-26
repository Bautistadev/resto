package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.ClienteDTO;
import com.spring.resto.resto.DTO.ClienteRequestDTO;
import com.spring.resto.resto.entity.Cliente;

public class ClienteMapperImplements implements ClienteMapper{

	@Override
	public ClienteDTO map(Cliente cliente) {
	
		ClienteDTO clienteDTO = new ClienteDTO();
		clienteDTO.setNombre(cliente.getNombre());
		clienteDTO.setApellido(cliente.getApellido());
		clienteDTO.setOcupacion(cliente.getOcupacion());
		clienteDTO.setId(cliente.getId());
		
		return clienteDTO;
	}

	@Override
	public Cliente map(ClienteDTO clienteDTO) {
		
		Cliente cliente = new Cliente();
		cliente.setId(clienteDTO.getId());
		cliente.setNombre(clienteDTO.getNombre());
		cliente.setApellido(clienteDTO.getApellido());
		cliente.setOcupacion(clienteDTO.getOcupacion());
		
		
		return cliente;
	}

	@Override
	public Cliente map(ClienteRequestDTO clienteDTO) {
		
		Cliente cliente = new Cliente();
		cliente.setNombre(clienteDTO.getNombre().toUpperCase());
		cliente.setApellido(clienteDTO.getApellido().toUpperCase());
		cliente.setOcupacion(clienteDTO.getOcupacion());
		
		return cliente;
	}

}
