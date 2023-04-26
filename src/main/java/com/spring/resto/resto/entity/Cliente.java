package com.spring.resto.resto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="ocupacionId")
	private Ocupacion ocupacion;
	
	@Column(name="nombre",nullable = true)
	private String nombre;
	
	@Column(name="apellido",nullable = true)
	private String apellido;

	public Cliente(Ocupacion ocupacion, String nombre, String apellido) {
		super();
		this.ocupacion = ocupacion;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Cliente() {
		super();
	}

	public Ocupacion getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(Ocupacion ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Cliente [ocupacion=" + ocupacion + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
}
