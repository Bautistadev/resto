package com.spring.resto.resto.DTO;

import javax.validation.constraints.NotBlank;

public class MarcaRequestDTO {
	
	@NotBlank
	private String nombre;
	
	public MarcaRequestDTO(String nombre) {
		this.nombre = nombre;
	}
	
	public MarcaRequestDTO(){
		
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}

	@Override
	public String toString() {
		return "MarcaRequestDTO [nombre=" + nombre + "]";
	}
	
	
}
