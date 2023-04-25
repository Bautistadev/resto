package com.spring.resto.resto.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PersonaRequestDTO {
	@NotBlank
	private String nombre;
	@NotBlank
	private String apellido;
	@NotNull
	private Integer dni;
	@NotBlank
	private String password;
	
	public PersonaRequestDTO(String nombre, String apellido, Integer dni, String password) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.password = password;
	}
	public PersonaRequestDTO() {
		super();
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
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "PersonaRequestDTO [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", password="
				+ password + "]";
	}
	
	
}
