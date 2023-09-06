package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.DetallePlatoDTO;
import com.spring.resto.resto.DTO.DetallePlatoRequestDTO;
import com.spring.resto.resto.entity.DetallePlato;

public class DetallePlatoMapperImplements implements DetallePlatoMapper{


	@Override
	public DetallePlatoDTO map(DetallePlato detallePlato) {
		// TODO Auto-generated method stub
		
		DetallePlatoDTO detallePlatoDTO = new DetallePlatoDTO();
		detallePlatoDTO.setId(detallePlato.getId());
		detallePlatoDTO.setPorcion(detallePlato.getPorcion());
		detallePlatoDTO.setPlato(detallePlato.getPlato());
		detallePlatoDTO.setCantidad(detallePlato.getCantidad());
		detallePlatoDTO.setOcupacion(detallePlato.getOcupacion());
		

		return detallePlatoDTO;
	}

	@Override
	public DetallePlato map(DetallePlatoRequestDTO detallePlatoRequestDTO) {
		// TODO Auto-generated method stub
		

		DetallePlato detallePlato = new DetallePlato();
		detallePlato.setPorcion(detallePlatoRequestDTO.getPorcion());
		detallePlato.setPlato(detallePlatoRequestDTO.getPlato());
		detallePlato.setCantidad(detallePlatoRequestDTO.getCantidad());
		detallePlato.setOcupacion(detallePlatoRequestDTO.getOcupacion());		
		
		return detallePlato;
	}

	@Override
	public DetallePlato map(DetallePlatoDTO detallePlatoDTO) {
		// TODO Auto-generated method stub
		
		DetallePlato detallePlato = new DetallePlato();
		detallePlato.setPorcion(detallePlatoDTO.getPorcion());
		detallePlato.setPlato(detallePlatoDTO.getPlato());
		detallePlato.setCantidad(detallePlatoDTO.getCantidad());
		detallePlato.setOcupacion(detallePlatoDTO.getOcupacion());		
		
		return detallePlato;
	}

}
