package com.spring.resto.resto.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EmpleadoDTO {
	
	@NotNull
	private Long id;
	@NotBlank
	private String nombre;
	@NotBlank
	private String apellido;
	@NotBlank
	private String password;
	@NotNull
	private Integer dni;
	
	public EmpleadoDTO() {
		super();
	}

	public EmpleadoDTO(@NotNull Long id, @NotBlank String nombre, @NotBlank String apellido, @NotBlank String password,
			@NotNull Integer dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.dni = dni;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "PersonaDTO [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", password=" + password
				+ ", dni=" + dni + "]";
	}

	


}
