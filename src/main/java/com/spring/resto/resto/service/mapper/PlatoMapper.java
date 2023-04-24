package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.PlatoDTO;
import com.spring.resto.resto.DTO.PlatoRequestDTO;
import com.spring.resto.resto.entity.Plato;


public interface PlatoMapper {
	
	Plato map(final PlatoDTO platoDTO);
	Plato map(final PlatoRequestDTO platoDTO);
	PlatoDTO map(final Plato plato);

}
