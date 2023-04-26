package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.DetallePlatoDTO;
import com.spring.resto.resto.DTO.DetallePlatoRequestDTO;
import com.spring.resto.resto.entity.DetallePlato;

public class DetallePlatoMapperImplements implements DetallePlatoMapper{

	
	private PlatoMapper platoMapper;
	
	public DetallePlatoMapperImplements(PlatoMapper platoMapper) {
		super();
		this.platoMapper = platoMapper;
	}

	@Override
	public DetallePlatoDTO map(DetallePlato detallePlato) {
		// TODO Auto-generated method stub
		
		DetallePlatoDTO detallePlatoDTO = new DetallePlatoDTO();
		detallePlatoDTO.setId(detallePlato.getId());
		detallePlatoDTO.setPorcion(detallePlato.getPorcion());
		detallePlatoDTO.setPlato(detallePlatoDTO.getPlato());
		detallePlatoDTO.setOcupacion(detallePlato.getOcupacion());
		
		return detallePlatoDTO;
	}

	@Override
	public DetallePlato map(DetallePlatoRequestDTO detallePlatoRequestDTO) {
		// TODO Auto-generated method stub
		

		DetallePlato detallePlato = new DetallePlato();
		detallePlato.setPorcion(detallePlatoRequestDTO.getPorcion());
		detallePlato.setPlato(detallePlatoRequestDTO.getPlato());
		detallePlato.setOcupacion(detallePlatoRequestDTO.getOcupacion());		
		
		return detallePlato;
	}

	@Override
	public DetallePlato map(DetallePlatoDTO detallePlatoDTO) {
		// TODO Auto-generated method stub
		
		DetallePlato detallePlato = new DetallePlato();
		detallePlato.setPorcion(detallePlatoDTO.getPorcion());
		detallePlato.setPlato(detallePlatoDTO.getPlato());
		detallePlato.setOcupacion(detallePlatoDTO.getOcupacion());		
		
		return detallePlato;
	}

}
