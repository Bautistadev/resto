package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.MesaDTO;
import com.spring.resto.resto.DTO.MesaRequestDTO;
import com.spring.resto.resto.entity.Mesa;

public class MesaMapperImplements implements MesaMapper {

	@Override
	public MesaDTO map(Mesa mesa) {
		// TODO Auto-generated method stub
		MesaDTO mesaDTO = new MesaDTO();
		mesaDTO.setId(mesa.getId());
		mesaDTO.setEstado(mesa.isEstado());
		mesaDTO.setPersona(mesa.getPersona());
		mesaDTO.setToken(mesa.getToken());
		mesaDTO.setGeolocalizacion(mesa.getGeolocalizacion());
		return mesaDTO;
	}

	@Override
	public Mesa map(MesaRequestDTO mesaDTO) {
		// TODO Auto-generated method stub
		
		Mesa mesa = new Mesa();
		mesa.setEstado(mesaDTO.isEstado());
		mesa.setPersona(mesaDTO.getEmpleado());
		mesa.setToken(mesaDTO.getToken());
		mesa.setGeolocalizacion(mesaDTO.getGeolocalizacion());
		
		
		return mesa;
	}

	@Override
	public Mesa map(MesaDTO mesaDTO) {
		// TODO Auto-generated method stub
		
		Mesa mesa = new Mesa();
		mesa.setEstado(mesaDTO.isEstado());
		mesa.setId(mesaDTO.getId());
		mesa.setPersona(mesaDTO.getEmpleado());
		mesa.setToken(mesaDTO.getToken());
		mesa.setGeolocalizacion(mesaDTO.getGeolocalizacion());
		
		return mesa;
	}

}
