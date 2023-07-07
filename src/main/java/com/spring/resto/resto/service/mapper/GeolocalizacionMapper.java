package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.GeolocalizacionDTO;
import com.spring.resto.resto.DTO.GeolocalizacionRequestDTO;
import com.spring.resto.resto.entity.Geolocalizacion;

public interface GeolocalizacionMapper {
	
	public GeolocalizacionDTO map(Geolocalizacion request);
	public Geolocalizacion map(GeolocalizacionDTO requestDTO);
	public Geolocalizacion map(GeolocalizacionRequestDTO requestDTO);
}
