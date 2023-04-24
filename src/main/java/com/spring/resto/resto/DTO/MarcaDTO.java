package com.spring.resto.resto.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MarcaDTO {
	
	@NotNull
	private Long id;
	
	@NotBlank
	private String nombre;
	
	public MarcaDTO() {
		super();
	}
	public MarcaDTO(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public Long getId() {
		return this.id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "MarcaDTO [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
