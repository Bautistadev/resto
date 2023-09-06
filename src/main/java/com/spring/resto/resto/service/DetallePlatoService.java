package com.spring.resto.resto.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import com.spring.resto.resto.DTO.DetallePlatoDTO;
import com.spring.resto.resto.DTO.DetallePlatoRequestDTO;
import com.spring.resto.resto.entity.DetallePlato;
import com.spring.resto.resto.repository.DetallePlatoRepository;
import com.spring.resto.resto.service.mapper.DetallePlatoMapper;

public class DetallePlatoService {
	
	private DetallePlatoRepository detallePlatoRepository;
	private DetallePlatoMapper detallePlatoMapper;
	
	public DetallePlatoService(DetallePlatoRepository detallePlatoRepository, DetallePlatoMapper detallePlatoMapper) {
		super();
		this.detallePlatoRepository = detallePlatoRepository;
		this.detallePlatoMapper = detallePlatoMapper;
	}
	
	public DetallePlato create(DetallePlatoRequestDTO detallePlatoRequestDTO) {
		
		DetallePlato detallePlato = detallePlatoMapper.map(detallePlatoRequestDTO);
		detallePlatoRepository.save(detallePlato);
		
		return detallePlato;
	}
	
	public DetallePlatoDTO update(DetallePlatoDTO detallePlatoDTO) {	
		
		DetallePlato detallePlato = detallePlatoMapper.map(detallePlatoDTO);
		detallePlatoRepository.save(detallePlato);
		
		return detallePlatoMapper.map(detallePlato);
	}
	
	public DetallePlatoDTO retrive(Long id){
		
		DetallePlato detallePlato = detallePlatoRepository.findById(id).get();	
		
		return detallePlatoMapper.map(detallePlato);
	}
	
	public List<DetallePlatoDTO>retriveAll(){
		Iterable<DetallePlato> detallePlatoIterable = detallePlatoRepository.findAll();
		Iterator<DetallePlato> detallePlatoIterator = detallePlatoIterable.iterator();
		List<DetallePlatoDTO> listaDetallePlato = new ArrayList<>();
		
		while(detallePlatoIterator.hasNext()) {
			listaDetallePlato.add(detallePlatoMapper.map(detallePlatoIterator.next()));
		}
		System.out.println(listaDetallePlato);
		
		return listaDetallePlato;
			
	}
	
}
