package com.spring.resto.resto.DTO;

import javax.validation.constraints.NotNull;

import com.spring.resto.resto.entity.Bebida;
import com.spring.resto.resto.entity.Ocupacion;

public class DetalleBebidaDTO {
	
	@NotNull
	private Long id;
	
	@NotNull
	private Integer cantidad;
	
	private Bebida bebida;
	
	private Ocupacion ocupacion;
	
	public DetalleBebidaDTO(Long id,Integer cantidad, Bebida bebida,Ocupacion ocupacion) {
		this.ocupacion = ocupacion;
		this.id = id;
		this.bebida = bebida;
		this.cantidad = cantidad;
	}
	public DetalleBebidaDTO() {}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
		return "DetalleBebidaDTO [id=" + id + ", cantidad=" + cantidad + ", bebida=" + bebida + ", ocupacion="
				+ ocupacion + "]";
	}
	
	
}
