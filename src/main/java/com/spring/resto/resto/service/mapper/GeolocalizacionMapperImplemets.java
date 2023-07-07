package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.GeolocalizacionDTO;
import com.spring.resto.resto.DTO.GeolocalizacionRequestDTO;
import com.spring.resto.resto.entity.Geolocalizacion;

public class GeolocalizacionMapperImplemets implements GeolocalizacionMapper {

	@Override
	public GeolocalizacionDTO map(Geolocalizacion request) {
		
		GeolocalizacionDTO responseDTO = new GeolocalizacionDTO();
		responseDTO.setId(request.getId());
		responseDTO.setX1(request.getX1());
		responseDTO.setX2(request.getX2());
		responseDTO.setX3(request.getX3());
		responseDTO.setX4(request.getX4());
		responseDTO.setY1(request.getY1());
		responseDTO.setY2(request.getY2());
		responseDTO.setY3(request.getY3());
		responseDTO.setY4(request.getY4());
		
		
		// TODO Auto-generated method stub
		return responseDTO;
	}

	@Override
	public Geolocalizacion map(GeolocalizacionDTO requestDTO) {
		// TODO Auto-generated method stub
		

		Geolocalizacion response = new Geolocalizacion();
		response.setId(requestDTO.getId());
		response.setX1(requestDTO.getX1());
		response.setX2(requestDTO.getX2());
		response.setX3(requestDTO.getX3());
		response.setX4(requestDTO.getX4());
		response.setY1(requestDTO.getY1());
		response.setY2(requestDTO.getY2());
		response.setY3(requestDTO.getY3());
		response.setY4(requestDTO.getY4());
		
		
		// TODO Auto-generated method stub
		return response;
		
	}

	@Override
	public Geolocalizacion map(GeolocalizacionRequestDTO requestDTO) {
		// TODO Auto-generated method stub
		Geolocalizacion response = new Geolocalizacion();
		
		response.setX1(requestDTO.getX1());
		response.setX2(requestDTO.getX2());
		response.setX3(requestDTO.getX3());
		response.setX4(requestDTO.getX4());
		response.setY1(requestDTO.getY1());
		response.setY2(requestDTO.getY2());
		response.setY3(requestDTO.getY3());
		response.setY4(requestDTO.getY4());
		
		return response;
	}

}
