package com.spring.resto.resto.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import com.spring.resto.resto.DTO.OcupacionDTO;
import com.spring.resto.resto.DTO.OcupacionRequestDTO;
import com.spring.resto.resto.entity.Ocupacion;
import com.spring.resto.resto.repository.OcupacionRepository;
import com.spring.resto.resto.service.mapper.OcupacionMapper;

public class OcupacionService {
	
	private OcupacionRepository ocupacionRepository;
	private OcupacionMapper ocupacionMapper;
	
	
	public OcupacionService(OcupacionRepository ocupacionRepository, OcupacionMapper ocupacionMapper) {
		super();
		
		this.ocupacionRepository = ocupacionRepository;
		this.ocupacionMapper = ocupacionMapper;
		
	}
	
	public OcupacionDTO create(OcupacionRequestDTO ocupacionDTO){
		
		try {
			Ocupacion ocupacion = this.ocupacionMapper.map(ocupacionDTO);
			
			this.ocupacionRepository.save(ocupacion);
			
			return this.ocupacionMapper.map(ocupacion);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public OcupacionDTO update(OcupacionDTO ocupacionDTO) {
		
		
		try {
			Ocupacion ocupacion = this.ocupacionMapper.map(ocupacionDTO);
			
			this.ocupacionRepository.save(ocupacion);
			
			return this.ocupacionMapper.map(ocupacion);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public OcupacionDTO retrive(Long id) {
		
		try {
			Ocupacion ocupacion = this.ocupacionRepository.findById(id).get();
			return ocupacionMapper.map(ocupacion);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List<OcupacionDTO> retriveAll(){
		try {
			Iterable<Ocupacion> ocupacionIterable = ocupacionRepository.findAll();
			Iterator<Ocupacion> ocupacionIterator = ocupacionIterable.iterator();
			List<OcupacionDTO> listOcupacion = new ArrayList<>();
			
			while(ocupacionIterator.hasNext())
				listOcupacion.add(this.ocupacionMapper.map(ocupacionIterator.next()));
			
			return listOcupacion;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	

}
