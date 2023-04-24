package com.spring.resto.resto.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.spring.resto.resto.DTO.DetalleBebidaDTO;
import com.spring.resto.resto.DTO.DetalleBebidaRequestDTO;
import com.spring.resto.resto.entity.DetalleBebida;
import com.spring.resto.resto.repository.DetalleBebidaRepository;
import com.spring.resto.resto.service.mapper.DetalleBebidaMapper;

public class DetalleBebidaService {
	
	private DetalleBebidaMapper bebidaDetalleMapper;
	private DetalleBebidaRepository bebidaDetalleRepository;
	
	
	public DetalleBebidaService(DetalleBebidaRepository bebidaDetalleRepository,DetalleBebidaMapper bebidaDetalleMapper) {
		this.bebidaDetalleMapper = bebidaDetalleMapper;
		this.bebidaDetalleRepository = bebidaDetalleRepository;
	}
	
	
	public DetalleBebidaDTO create(DetalleBebidaRequestDTO request) throws Exception {
		DetalleBebida bebida = bebidaDetalleMapper.map(request);
		bebidaDetalleRepository.save(bebida);
		DetalleBebidaDTO response = bebidaDetalleMapper.map(bebida);
		return response;
	}
	
	public DetalleBebidaDTO update(DetalleBebidaDTO request) throws Exception{
		DetalleBebida bebida = bebidaDetalleMapper.map(request);
		bebidaDetalleRepository.save(bebida);
		DetalleBebidaDTO response = bebidaDetalleMapper.map(bebida);
		return response;
	}
	
	public List<DetalleBebidaDTO> retriveAll() throws Exception{
		Iterable<DetalleBebida> listaDB = bebidaDetalleRepository.findAll();
		Iterator<DetalleBebida> listaIterable = listaDB.iterator();
		List<DetalleBebidaDTO> response = new ArrayList<>();
		while(listaIterable.hasNext())
			response.add(bebidaDetalleMapper.map(listaIterable.next()));
		
		return response;
	}
	
	public DetalleBebidaDTO retrive(Long id) throws Exception {
		Optional<DetalleBebida> bebida = bebidaDetalleRepository.findById(id);
		
		return bebidaDetalleMapper.map(bebida.get());
	}
	
	
}
