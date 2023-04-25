package com.spring.resto.resto.DTO;

import javax.validation.constraints.NotBlank;

import com.spring.resto.resto.entity.Ocupacion;

public class ClienteRequestDTO {

	private Ocupacion ocupacion;
	
	@NotBlank
	private String nombre;
	
	@NotBlank
	private String apellido;
	
	public ClienteRequestDTO(Ocupacion ocupacion, String nombre, String apellido) {
		this.ocupacion = ocupacion;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public ClienteRequestDTO() {}

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

	@Override
	public String toString() {
		return "ClienteRequestDTO [ocupacion=" + ocupacion + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	
	
}
