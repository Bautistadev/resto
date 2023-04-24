package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.DetalleBebidaDTO;
import com.spring.resto.resto.DTO.DetalleBebidaRequestDTO;
import com.spring.resto.resto.entity.DetalleBebida;

public class DetalleBebidaMapperImplements implements DetalleBebidaMapper {



	@Override
	public DetalleBebidaDTO map(DetalleBebida request) throws Exception {
		
		DetalleBebidaDTO bebida = new DetalleBebidaDTO();
		bebida.setId(request.getId());
		if(request.getCantidad() == 0)
			throw new Exception("ERROR, LA CANTIDAD DE BEBIDA NO PUEDE SER 0");
		bebida.setBebida(request.getBebida());
		bebida.setOcupacion(request.getOcupacion());
		bebida.setCantidad(request.getCantidad());
		
		return bebida;
	}

	@Override
	public DetalleBebida map(DetalleBebidaRequestDTO request) {
		// TODO Auto-generated method stub
		
		DetalleBebida bebida = new DetalleBebida();
		bebida.setCantidad(request.getCantidad());
		bebida.setBebida(request.getBebida());
		bebida.setOcupacion(request.getOcupacion());
		return bebida;
	}
	
	@Override
	public DetalleBebida map(DetalleBebidaDTO request) {
		// TODO Auto-generated method stub
		DetalleBebida bebida = new DetalleBebida();
		bebida.setId(request.getId());
		bebida.setBebida(request.getBebida());
		bebida.setOcupacion(request.getOcupacion());
		bebida.setCantidad(request.getCantidad());
		
		return bebida;
	}

}
