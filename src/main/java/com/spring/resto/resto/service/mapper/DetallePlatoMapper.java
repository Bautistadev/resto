package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.DetallePlatoDTO;
import com.spring.resto.resto.DTO.DetallePlatoRequestDTO;
import com.spring.resto.resto.entity.DetallePlato;


public interface DetallePlatoMapper {
	public DetallePlatoDTO map(DetallePlato detallePlato);
	public DetallePlato map(DetallePlatoRequestDTO detallePlatoRequestDTO);
	public DetallePlato map(DetallePlatoDTO detallePlatoDTO);
}
