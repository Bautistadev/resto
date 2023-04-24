package com.spring.resto.resto.DTO;

import javax.validation.constraints.NotNull;

import com.spring.resto.resto.entity.Bebida;
import com.spring.resto.resto.entity.Ocupacion;

public class DetalleBebidaRequestDTO {
	
	@NotNull
	private Integer cantidad;
	private Bebida bebida;
	private Ocupacion ocupacion;
	
	public DetalleBebidaRequestDTO(Integer cantidad,Bebida bebida , Ocupacion ocupacion) {
		this.cantidad = cantidad;
		this.bebida = bebida;
		this.ocupacion = ocupacion;
	}
	
	public DetalleBebidaRequestDTO() {}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public Ocupacion getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(Ocupacion ocupacion) {
		this.ocupacion = ocupacion;
	}

	@Override
	public String toString() {
		return "DetalleBebidaRequestDTO [cantidad=" + cantidad + ", bebida=" + bebida + ", ocupacion=" + ocupacion
				+ "]";
	}
	
	
}
