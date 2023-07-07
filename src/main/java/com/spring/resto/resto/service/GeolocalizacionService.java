package com.spring.resto.resto.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.spring.resto.resto.DTO.GeolocalizacionDTO;
import com.spring.resto.resto.DTO.GeolocalizacionRequestDTO;
import com.spring.resto.resto.entity.Geolocalizacion;
import com.spring.resto.resto.repository.GeolocalizacionRepository;
import com.spring.resto.resto.service.mapper.GeolocalizacionMapper;

public class GeolocalizacionService {
	
	private GeolocalizacionMapper geolocalizacionMapper;
	private GeolocalizacionRepository geolocalizacionRepository;
	
	public GeolocalizacionService(GeolocalizacionMapper geolocalizacionMapper,
			GeolocalizacionRepository geolocalizacionRepository) {
		super();
		this.geolocalizacionMapper = geolocalizacionMapper;
		this.geolocalizacionRepository = geolocalizacionRepository;
	}
	
	public GeolocalizacionDTO create(GeolocalizacionRequestDTO requestDTO) {
		
		Geolocalizacion response = this.geolocalizacionMapper.map(requestDTO);
		
		this.geolocalizacionRepository.save(response);
		
		return this.geolocalizacionMapper.map(response);
	}
	
	public GeolocalizacionDTO update(GeolocalizacionDTO requestDTO) {
			
		Geolocalizacion response = this.geolocalizacionMapper.map(requestDTO);
		
		this.geolocalizacionRepository.save(response);
		
		return this.geolocalizacionMapper.map(response);
	}
	
	public List<GeolocalizacionDTO> retriveAll(){
		Iterable <Geolocalizacion> geoIterable = this.geolocalizacionRepository.findAll();
		Iterator <Geolocalizacion> geoIterator = geoIterable.iterator();
		
		List<GeolocalizacionDTO> listaGeo = new ArrayList<>();
		
		while(geoIterator.hasNext())
			listaGeo.add(this.geolocalizacionMapper.map(geoIterator.next()));
		
		return listaGeo;
	}
	
	

}
