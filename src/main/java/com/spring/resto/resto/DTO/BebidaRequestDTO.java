package com.spring.resto.resto.DTO;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.spring.resto.resto.entity.Marca;

public class BebidaRequestDTO {
	
	@NotBlank
	private String nombre;
	
	@NotBlank
	private String descripcion;
	
	
	private Marca marca;

	public BebidaRequestDTO(@NotBlank String nombre, @NotBlank String descripcion, Marca marca) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.marca = marca;
	}

	public BebidaRequestDTO() {
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
	
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}



	@Override
	public String toString() {
		return "BebidaRequestDTO [nombre=" + nombre + ", descripcion=" + descripcion + ", marca=" + marca + "]";
	}

	

	
	
}
