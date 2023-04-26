package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.MesaDTO;
import com.spring.resto.resto.DTO.MesaRequestDTO;
import com.spring.resto.resto.entity.Mesa;

public interface MesaMapper {
	public MesaDTO map(Mesa mesa);
	public Mesa map(MesaRequestDTO mesa);
	public Mesa map(MesaDTO mesa);
}
