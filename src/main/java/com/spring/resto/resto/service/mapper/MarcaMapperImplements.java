package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.MarcaDTO;
import com.spring.resto.resto.DTO.MarcaRequestDTO;
import com.spring.resto.resto.entity.Marca;

public class MarcaMapperImplements implements MarcaMapper{

	@Override
	public Marca map(MarcaRequestDTO requestDTO) {
		// TODO Auto-generated method stub
		
		Marca result = new Marca();
		result.setNombre(requestDTO.getNombre().toUpperCase());
		
		return result;
	}

	@Override
	public Marca map(MarcaDTO requestDTO) {
		// TODO Auto-generated method stub
		
		Marca result = new Marca();
		result.setId(requestDTO.getId());
		result.setNombre(requestDTO.getNombre());
		
		return result;
	}

	@Override
	public MarcaDTO map(Marca request) {
		// TODO Auto-generated method stub
		
		MarcaDTO result = new MarcaDTO();
		result.setId(request.getId());
		result.setNombre(request.getNombre());
		
		return result;
	}

}
