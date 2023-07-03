package com.spring.resto.resto.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.spring.resto.resto.entity.Categoria;

public class PlatoRequestDTO {

	@NotBlank
	private String nombre;
	
	@NotBlank
	private String descripcion;
	
	@NotNull
	private Categoria categoria;
	
	@NotNull
	private Float precio;
	

	public PlatoRequestDTO(@NotBlank String nombre, @NotBlank String descripcion, @NotNull Categoria categoria, @NotNull Float precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
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
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "PlatoRequestDTO [nombre=" + nombre + ", descripcion=" + descripcion + ", categoria=" + categoria
				+ ", precio=" + precio + "]";
	}

}
