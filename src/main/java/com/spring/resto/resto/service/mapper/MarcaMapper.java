package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.MarcaDTO;
import com.spring.resto.resto.DTO.MarcaRequestDTO;
import com.spring.resto.resto.entity.Marca;

public interface MarcaMapper {
	public Marca map(MarcaRequestDTO requestDTO);
	public Marca map(MarcaDTO requestDTO);
	public MarcaDTO map(Marca request);

}
