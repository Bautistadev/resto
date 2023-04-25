package com.spring.resto.resto.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.spring.resto.resto.entity.Ocupacion;

public class ClienteDTO {
	
	@NotNull
	private Long id;
	
	private Ocupacion ocupacion;
	
	@NotBlank
	private String nombre;
	
	@NotBlank
	private String apellido;
	
	
	public ClienteDTO(Long id, Ocupacion ocupacion,String nombre, String apellido) {
		this.id = id;
		this.ocupacion = ocupacion;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public ClienteDTO() {		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "ClienteDTO [id=" + id + ", ocupacion=" + ocupacion + ", nombre=" + nombre + ", apellido=" + apellido
				+ "]";
	}
	
	
}
