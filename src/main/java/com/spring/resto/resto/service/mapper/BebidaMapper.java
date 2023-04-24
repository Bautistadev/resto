package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.BebidaDTO;
import com.spring.resto.resto.DTO.BebidaRequestDTO;
import com.spring.resto.resto.entity.Bebida;

public interface BebidaMapper {
	
	Bebida map(final BebidaDTO bebidaDTO);
	Bebida map(final BebidaRequestDTO bebidaDTO);
	BebidaDTO map(final Bebida bebida);
}
