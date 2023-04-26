package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.ClienteDTO;
import com.spring.resto.resto.DTO.ClienteRequestDTO;
import com.spring.resto.resto.entity.Cliente;

public interface ClienteMapper {
	public ClienteDTO map(Cliente cliente);
	public Cliente map(ClienteDTO clienteDTO);
	public Cliente map(ClienteRequestDTO clienteDTO);
}
