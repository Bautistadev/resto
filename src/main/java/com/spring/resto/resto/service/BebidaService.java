package com.spring.resto.resto.service;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import com.spring.resto.resto.DTO.BebidaDTO;
import com.spring.resto.resto.DTO.BebidaRequestDTO;
import com.spring.resto.resto.entity.Bebida;
import com.spring.resto.resto.repository.BebidaRepository;
import com.spring.resto.resto.service.mapper.BebidaMapper;

public class BebidaService {
	
	private BebidaRepository bebidaRepository;
	private BebidaMapper bebidaMapper;
	
	public BebidaService(BebidaRepository bebidaRepository, BebidaMapper bebidaMapper) {
		
		this.bebidaRepository = bebidaRepository;
		this.bebidaMapper = bebidaMapper;
	}
	
	
	public BebidaDTO create(BebidaRequestDTO request) {
		
		Bebida bebida = bebidaMapper.map(request);
		bebidaRepository.save(bebida);
		return bebidaMapper.map(bebida);
		
	}
	
	public BebidaDTO update(BebidaDTO request) {
		
		Bebida bebida = bebidaMapper.map(request);
		bebidaRepository.save(bebida);
		return bebidaMapper.map(bebida);
		
	}
	
	public BebidaDTO retrive(Long id) {
		
		Optional<Bebida> bebida = bebidaRepository.findById(id);
		
		if(bebida == null)
			throw new RuntimeException(String.format("NO EXISTE EL SIGUIENTE PRODUCTO CON ID: %d", id));
		
		return bebidaMapper.map(bebida.get());
	}
	
	public List<BebidaDTO>retriveAll(){
		
		Iterable<Bebida> bebidas = bebidaRepository.findAll();
		Iterator<Bebida> bebidasIterator = bebidas.iterator();
		
		List<BebidaDTO> listaBebidas = new ArrayList<>();
		
		while(bebidasIterator.hasNext())
			listaBebidas.add(bebidaMapper.map(bebidasIterator.next()));
	
		return listaBebidas;
	}
	
}
