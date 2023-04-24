package com.spring.resto.resto.service.mapper;

import java.util.Date;

import com.spring.resto.resto.DTO.BebidaDTO;
import com.spring.resto.resto.DTO.BebidaRequestDTO;
import com.spring.resto.resto.entity.Bebida;

public class BebidaMapperImplements implements BebidaMapper{

	@Override
	public Bebida map(BebidaDTO bebidaDTO) {
		// TODO Auto-generated method stub
		Bebida map = new Bebida();
		map.setId(bebidaDTO.getId());
		map.setNombre(bebidaDTO.getNombre());
		map.setDescripcion(bebidaDTO.getDescripcion());
		map.setMarca(bebidaDTO.getMarca());
		map.setdateCreated(bebidaDTO.getDateCreated());
		if(bebidaDTO.getDateDeleted() != null)
			map.setDateDeleted(bebidaDTO.getDateDeleted());
		
		return map;
	}

	@Override
	public Bebida map(BebidaRequestDTO bebidaDTO) {
		// TODO Auto-generated method stub
		
		Bebida map = new Bebida();
		map.setNombre(bebidaDTO.getNombre().toUpperCase());
		map.setDescripcion(bebidaDTO.getDescripcion());
		map.setMarca(bebidaDTO.getMarca());
		map.setdateCreated(new Date());
		
		return map;
	}

	@Override
	public BebidaDTO map(Bebida bebida) {
		// TODO Auto-generated method stub
		
		BebidaDTO map = new BebidaDTO();
		map.setId(bebida.getId());
		map.setNombre(bebida.getNombre());
		map.setDescripcion(bebida.getDescripcion());
		map.setMarca(bebida.getMarca());
		map.setDateCreated(bebida.getDateCreated());
		if(bebida.getDateDeleted() != null)
			map.setDateDeleted(bebida.getDateDeleted());
		
		return map;
		
	}

}
