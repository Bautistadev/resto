package com.spring.resto.resto.service.mapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.spring.resto.resto.DTO.DetalleBebidaDTO;
import com.spring.resto.resto.DTO.DetallePlatoDTO;
import com.spring.resto.resto.DTO.OcupacionDTO;
import com.spring.resto.resto.DTO.OcupacionRequestDTO;
import com.spring.resto.resto.entity.DetalleBebida;
import com.spring.resto.resto.entity.DetallePlato;
import com.spring.resto.resto.entity.Ocupacion;

public class OcupacionMapperImplements implements OcupacionMapper{
	
	private DetalleBebidaMapper bebidaMapper;
	private DetallePlatoMapper platoMapper;
	
	

	public OcupacionMapperImplements(DetalleBebidaMapper bebidaMapper, DetallePlatoMapper platoMapper) {
		super();
		this.bebidaMapper = bebidaMapper;
		this.platoMapper = platoMapper;
	}

	@Override
	public OcupacionDTO map(Ocupacion ocupacion) throws Exception {
		// TODO Auto-generated method stub
		OcupacionDTO ocupacionDTO = new OcupacionDTO();
		ocupacionDTO.setId(ocupacion.getId());
		ocupacionDTO.setInicio(ocupacion.getInicio());
		ocupacionDTO.setMesa(ocupacion.getMesa());
		
		if(ocupacion.getFin() != null)
			ocupacionDTO.setFin(ocupacion.getFin());
		
		ocupacionDTO.setDetalleBebida(ocupacion.getDetalleBebida());
		ocupacionDTO.setDetallePlato(ocupacion.getDetallePlato());
		
		return ocupacionDTO;
	}

	@Override
	public Ocupacion map(OcupacionDTO ocupacionDTO) throws Exception {
		// TODO Auto-generated method stub
		
		Ocupacion ocupacion = new Ocupacion();
		

		ocupacion.setId(ocupacionDTO.getId());
		ocupacion.setInicio(ocupacionDTO.getInicio());
		ocupacion.setMesa(ocupacionDTO.getMesa());
		
		if(ocupacionDTO.getFin() != null)
			ocupacion.setFin(ocupacionDTO.getFin());
		ocupacion.setDetalleBebida(ocupacionDTO.getDetalleBebida());
		ocupacion.setDetallePlato(ocupacionDTO.getDetallePlato());
		
		return ocupacion;
	}

	@Override
	public Ocupacion map(OcupacionRequestDTO ocupacionDTO) throws Exception {
		// TODO Auto-generated method stub
		Ocupacion ocupacion = new Ocupacion();
		
		
		ocupacion.setInicio(LocalDateTime.now());
		ocupacion.setMesa(ocupacionDTO.getMesa());
		

		

		return ocupacion;
	}

}
