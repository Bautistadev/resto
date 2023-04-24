package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.DetalleBebidaDTO;
import com.spring.resto.resto.DTO.DetalleBebidaRequestDTO;
import com.spring.resto.resto.entity.DetalleBebida;

public interface DetalleBebidaMapper {
	

	public DetalleBebidaDTO map(DetalleBebida request) throws Exception;
	public DetalleBebida map(DetalleBebidaRequestDTO request);
	public DetalleBebida map(DetalleBebidaDTO reuqest);


}
