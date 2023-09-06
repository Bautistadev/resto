package com.spring.resto.resto.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.multipart.MultipartFile;

import com.spring.resto.resto.DTO.PlatoDTO;
import com.spring.resto.resto.DTO.PlatoRequestDTO;
import com.spring.resto.resto.entity.Plato;
import com.spring.resto.resto.repository.PlatoRepository;
import com.spring.resto.resto.service.mapper.PlatoMapper;


public class PlatoService {
	
	
	private PlatoRepository platoRepository;
	private PlatoMapper platoMapper;
	

	public PlatoService(PlatoRepository platoRepository,PlatoMapper platoMapper) {
		this.platoRepository = platoRepository;
		this.platoMapper = platoMapper;
	}
	
	
	public PlatoDTO create(PlatoRequestDTO element){
		//CONVERTIMOS EL ELEMENTO(REQUERIMIENTO) EN UNA ENTIDAD
		
		Plato plato = platoMapper.map(element);
		
		//PERSISTIMOS
		platoRepository.save(plato);
		
		//DEVOLVEMOS LA ENTIDAD TRANFORMADO EN UN DATO 
		return platoMapper.map(plato);
	}
	
	public PlatoDTO update(PlatoDTO elemnt) {
		
		Plato plato = platoMapper.map(elemnt);
		platoRepository.save(plato);
		
		return platoMapper.map(plato);
	}
	
	public PlatoDTO retrive(Long id) {
		
		Optional<Plato> plato = platoRepository.findById(id);
		
		if(plato == null) {
			throw new RuntimeException(String.format("NO EXISTE UN PRODUCTO CON EL SIGUIENTE ID: %d", id));
		}
		return platoMapper.map(plato.get());
	}
	
	public List<PlatoDTO>retriveAll(){
		
		Iterable<Plato>platos =  platoRepository.findAll();
		Iterator<Plato>platosIterator = platos.iterator();
		
		List<PlatoDTO>listaPlatos = new ArrayList<>();
		
		while(platosIterator.hasNext())
			listaPlatos.add(platoMapper.map(platosIterator.next()));
		
		return listaPlatos;
	}
}
