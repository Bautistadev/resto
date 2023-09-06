package com.spring.resto.resto.service.mapper;

import java.io.IOException;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import com.spring.resto.resto.DTO.PlatoDTO;
import com.spring.resto.resto.DTO.PlatoRequestDTO;
import com.spring.resto.resto.entity.Plato;

public class PlatoMapperImplements implements PlatoMapper{
	
	@Override
	public Plato map(final PlatoDTO platoDTO) {
		// TODO Auto-generated method stub
		
		//TERMINOS RESPONSE DE RESPUESTA, QUE VA A RESPONDER LA FUNCION
		
		Plato response = new Plato();
		response.setId(platoDTO.getId());
		response.setNombre(platoDTO.getNombre());
		response.setDescripcion(platoDTO.getDescripcion());
		response.setDateCreated(platoDTO.getDateCreated());
		response.setCategoria(platoDTO.getCategoria());
		response.setPrecio(platoDTO.getPrecio());

		
		if(platoDTO.getDateDeleted() != null)
			response.setDateDeleted(platoDTO.getDateDeleted());
		
		return response;
	}

	@Override
	public Plato map(PlatoRequestDTO plato) {
		// TODO Auto-generated method stub
		
		Plato response = new Plato();
		response.setNombre(plato.getNombre().toUpperCase());
		response.setDescripcion(plato.getDescripcion());
		response.setDateCreated(new Date());
		response.setCategoria(plato.getCategoria());
		response.setPrecio(plato.getPrecio());
		

	

		return response;
	}

	@Override
	public PlatoDTO map(Plato plato) {
		// TODO Auto-generated method stub
		
		PlatoDTO response = new PlatoDTO();
		response.setId(plato.getId());
		response.setNombre(plato.getNombre());
		response.setDescripcion(plato.getDescripcion());
		response.setDateCreated(plato.getDateCreated());
		response.setCategoria(plato.getCategoria());
		response.setPrecio(plato.getPrecio());

		
		if(plato.getDateDeleted() != null)
			response.setDateDeleted(plato.getDateDeleted());
		
		return response;
	}

}
