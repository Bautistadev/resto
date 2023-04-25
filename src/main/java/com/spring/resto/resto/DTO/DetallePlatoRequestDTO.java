package com.spring.resto.resto.DTO;

import javax.validation.constraints.NotNull;

import com.spring.resto.resto.entity.Ocupacion;
import com.spring.resto.resto.entity.Plato;
import com.spring.resto.resto.entity.Porcion;

public class DetallePlatoRequestDTO {
	
	@NotNull
	private Integer cantidad;
	private Porcion porcion;
	private Plato plato;
	private Ocupacion ocupacion;
	
	public DetallePlatoRequestDTO() {
		super();
	}
	public DetallePlatoRequestDTO(Integer cantidad, Porcion porcion, Plato plato, Ocupacion ocupacion) {
		super();
		this.cantidad = cantidad;
		this.porcion = porcion;
		this.plato = plato;
		this.ocupacion = ocupacion;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Porcion getPorcion() {
		return porcion;
	}
	public void setPorcion(Porcion porcion) {
		this.porcion = porcion;
	}
	public Plato getPlato() {
		return plato;
	}
	public void setPlato(Plato plato) {
		this.plato = plato;
	}
	public Ocupacion getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(Ocupacion ocupacion) {
		this.ocupacion = ocupacion;
	}
	
	
	
}
