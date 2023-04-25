package com.spring.resto.resto.DTO;

import com.spring.resto.resto.entity.Ocupacion;
import com.spring.resto.resto.entity.Plato;
import com.spring.resto.resto.entity.Porcion;

public class DetallePlatoDTO {
	
	private Long id;
	private Integer cantidad;
	private Porcion porcion;
	private Plato plato;
	private Ocupacion ocupacion;
	public DetallePlatoDTO(Long id, Integer cantidad, Porcion porcion, Plato plato, Ocupacion ocupacion) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.porcion = porcion;
		this.plato = plato;
		this.ocupacion = ocupacion;
	}
	public DetallePlatoDTO() {
		super();
	}
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
	@Override
	public String toString() {
		return "DetallePlatoDTO [id=" + id + ", cantidad=" + cantidad + ", porcion=" + porcion + ", plato=" + plato
				+ ", ocupacion=" + ocupacion + "]";
	}
	
	

}
