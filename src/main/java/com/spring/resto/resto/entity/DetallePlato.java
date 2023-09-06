package com.spring.resto.resto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "detalle")
public class DetallePlato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "cantidad",nullable = false)
	private Integer cantidad;
	
	@ManyToOne
	@JoinColumn(name = "porcionId")
	private Porcion porcion;
	
	@ManyToOne
	@JoinColumn(name = "platoId")
	private Plato plato;
	
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "ocupacionId")
	private Ocupacion ocupacion;

	public DetallePlato(Long id, Integer cantidad, Plato plato) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.plato = plato;
	}

	public DetallePlato() {
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

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}
	
	public Porcion getPorcion() {
		return porcion;
	}

	public void setPorcion(Porcion porcion) {
		this.porcion = porcion;
	}

	public Ocupacion getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(Ocupacion ocupacion) {
		this.ocupacion = ocupacion;
	}

	@Override
	public String toString() {
		return "Detalle [id=" + id + ", cantidad=" + cantidad + ", plato=" + plato + "]";
	}
	
	
}
