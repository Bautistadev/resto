package com.spring.resto.resto.service.mapper;

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
		
		//---------------------BEBIDAS-----------------------//
		Iterable<DetalleBebida> detalleBebida = ocupacion.getDetalleBebida();
		Iterator<DetalleBebida> detalleBebidaIterator = detalleBebida.iterator();
		List<DetalleBebidaDTO> listaDetalleBebidaDTO = new ArrayList<>();
		List<DetalleBebida> listaDetalleBebida = new ArrayList<>();
		
		//---------------------PLATOS------------------------//
		Iterable<DetallePlato> detallePlato = ocupacion.getDetallePlato();
		Iterator<DetallePlato> detallePlatoIterator = detallePlato.iterator();
		List<DetallePlatoDTO> listaDetallePlatoDTO = new ArrayList<>();
		List<DetallePlato> listaDetallePlato = new ArrayList<>();
		
		ocupacionDTO.setId(ocupacion.getId());
		ocupacionDTO.setInicio(ocupacion.getInicio());
		if(ocupacion.getFin() != null)
			ocupacionDTO.setFin(ocupacion.getFin());
		
		while(detalleBebidaIterator.hasNext())
			listaDetalleBebidaDTO.add(bebidaMapper.map(detalleBebidaIterator.next()));
		while(listaDetalleBebidaDTO.iterator().hasNext())
			listaDetalleBebida.add(bebidaMapper.map(listaDetalleBebidaDTO.iterator().next()));
			
		while(detallePlatoIterator.hasNext())
			listaDetallePlatoDTO.add(platoMapper.map(detallePlatoIterator.next()));
		while(listaDetallePlatoDTO.iterator().hasNext())
			listaDetallePlato.add(platoMapper.map(listaDetallePlatoDTO.iterator().next()));
		
		ocupacionDTO.setDetalleBebida(listaDetalleBebida);
		ocupacionDTO.setDetallePlato(listaDetallePlato);
		
		return ocupacionDTO;
	}

	@Override
	public Ocupacion map(OcupacionDTO ocupacionDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ocupacion map(OcupacionRequestDTO ocuapcionDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
