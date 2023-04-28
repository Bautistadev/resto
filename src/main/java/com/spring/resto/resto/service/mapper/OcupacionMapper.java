package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.OcupacionDTO;
import com.spring.resto.resto.DTO.OcupacionRequestDTO;
import com.spring.resto.resto.entity.Ocupacion;

public interface OcupacionMapper {
	public OcupacionDTO map(Ocupacion ocupacion) throws Exception;
	public Ocupacion map(OcupacionDTO ocupacionDTO) throws Exception;
	public Ocupacion map(OcupacionRequestDTO ocuapcionDTO) throws Exception;
}
