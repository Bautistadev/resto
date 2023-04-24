package com.spring.resto.resto.DTO;

import javax.validation.constraints.NotBlank;

public class PlatoRequestDTO {

	@NotBlank
	private String nombre;
	
	@NotBlank
	private String descripcion;

	public PlatoRequestDTO(@NotBlank String nombre, @NotBlank String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public PlatoRequestDTO() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "PlatoRequestDTO [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
}
