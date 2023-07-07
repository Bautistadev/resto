package com.spring.resto.resto.controller;

import java.util.List;

import javax.validation.Valid;

import com.spring.resto.resto.DTO.GeolocalizacionDTO;
import com.spring.resto.resto.DTO.GeolocalizacionRequestDTO;
import com.spring.resto.resto.controller.delegate.GeolocalizacionApiDelegate;
import com.spring.resto.resto.service.GeolocalizacionService;

public class GeolocalizacionController implements GeolocalizacionApiDelegate {

	private GeolocalizacionService geoService;

	
	
	public GeolocalizacionController(GeolocalizacionService geoService) {
		super();
		this.geoService = geoService;
	}

	@Override
	public GeolocalizacionDTO create(@Valid GeolocalizacionRequestDTO geolocalizacionDTO) {
		// TODO Auto-generated method stub
		return this.geoService.create(geolocalizacionDTO);
	}

	@Override
	public GeolocalizacionDTO update(@Valid GeolocalizacionDTO geolocalizacionDTO) {
		// TODO Auto-generated method stub
		return this.geoService.update(geolocalizacionDTO);
	}

	@Override
	public List<GeolocalizacionDTO> retriveAll() {
		// TODO Auto-generated method stub
		return this.geoService.retriveAll();
	}
	
	


}
