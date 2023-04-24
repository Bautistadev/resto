package com.spring.resto.resto.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.spring.resto.resto.DTO.MarcaDTO;
import com.spring.resto.resto.DTO.MarcaRequestDTO;
import com.spring.resto.resto.entity.Marca;
import com.spring.resto.resto.repository.MarcaRepository;
import com.spring.resto.resto.service.mapper.MarcaMapper;

public class MarcaService {
	
	
	private MarcaRepository marcaRepository;
	private MarcaMapper marcaMapper;
	
	public MarcaService(MarcaRepository marcaRepository, MarcaMapper marcaMapper) {
		super();
		this.marcaRepository = marcaRepository;
		this.marcaMapper = marcaMapper;
	}

	public List<MarcaDTO> retriveAll(){
		
		Iterable<Marca> marcas = marcaRepository.findAll();
		Iterator<Marca> marcaIterator = marcas.iterator();
		List<MarcaDTO> marcaList = new ArrayList<>();
		
		while(marcaIterator.hasNext())
			marcaList.add(marcaMapper.map(marcaIterator.next()));
		
		return marcaList;
		
	}
	
	public MarcaDTO retrive(Long id) {
		
		Optional<Marca> marca = marcaRepository.findById(id);
		
		if(marca == null)
			throw new RuntimeException(String .format("NO EXISTE UNA MARCA CON EL SIGUIENTE ID: %d", id));
		
		return marcaMapper.map(marca.get());
	}
	
	public MarcaDTO create(MarcaRequestDTO requestDTO) {
		
		Marca marca = marcaMapper.map(requestDTO);
		marcaRepository.save(marca);
		
		return marcaMapper.map(marca);	
	}
	
	public MarcaDTO update(MarcaDTO requestDTO) {
		
		Marca marca = marcaMapper.map(requestDTO);
		marcaRepository.save(marca);
		
		return marcaMapper.map(marca);	
	}
}
