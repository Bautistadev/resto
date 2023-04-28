package com.spring.resto.resto.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.spring.resto.resto.DTO.MesaDTO;
import com.spring.resto.resto.DTO.MesaRequestDTO;
import com.spring.resto.resto.entity.Mesa;
import com.spring.resto.resto.repository.MesaRepository;
import com.spring.resto.resto.service.mapper.MesaMapper;

public class MesaService {
	
	private MesaRepository mesaRepository;
	private MesaMapper mesaMapper;
	
	public MesaService(MesaRepository mesaRepository, MesaMapper mesaMapper) {
		super();
		this.mesaRepository = mesaRepository;
		this.mesaMapper = mesaMapper;
	}
	
	
	public MesaDTO create(MesaRequestDTO requestDTO) {
		
		Mesa mesa = this.mesaMapper.map(requestDTO);
		this.mesaRepository.save(mesa);
		
		return this.mesaMapper.map(mesa);
	}
	
	public MesaDTO update(MesaDTO requestDTO) {
		
		Mesa mesa = this.mesaMapper.map(requestDTO);
		this.mesaRepository.save(mesa);
		
		return this.mesaMapper.map(mesa);
	}
	
	public MesaDTO retrive(Long id) {
		
		Mesa mesa = this.mesaRepository.findById(id).get();
		
		return this.mesaMapper.map(mesa);
	}
	
	public List<MesaDTO> retriveAll(){
		
		Iterable<Mesa> mesaIterable = this.mesaRepository.findAll();
		Iterator<Mesa> mesaIterator = mesaIterable.iterator();
		List<MesaDTO> listaMesaDTO = new ArrayList<>();
		
		while(mesaIterator.hasNext())
			listaMesaDTO.add(this.mesaMapper.map(mesaIterator.next()));
		
		return listaMesaDTO;
	}
	
}
