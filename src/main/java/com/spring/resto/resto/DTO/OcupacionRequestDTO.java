package com.spring.resto.resto.DTO;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.spring.resto.resto.entity.*;

public class OcupacionRequestDTO {
	


	private Mesa mesa;
	
	public OcupacionRequestDTO(Mesa mesa, List<DetallePlato> detallePlato,
			List<DetalleBebida> detalleBebida) {
		super();


		this.mesa = mesa;
	}
	public OcupacionRequestDTO() {
		super();
	}


	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	
	
	
}
