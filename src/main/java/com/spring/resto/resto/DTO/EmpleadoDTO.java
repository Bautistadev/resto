package com.spring.resto.resto.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.spring.resto.resto.security.entity.Rol;

public class EmpleadoDTO {
	
	@NotNull
	private Long id;
	@NotBlank
	private String userName;
	@NotBlank
	private String nombre;
	@NotBlank
	private String apellido;
	@NotBlank
	private String password;
	@NotNull
	private Integer dni;
	@NotNull
	private Rol rol;
	
	
	public EmpleadoDTO() {
		super();
	}

	public EmpleadoDTO(@NotNull Long id, @NotBlank String userName, @NotBlank String nombre, @NotBlank String apellido,
			@NotBlank String password, @NotNull Integer dni,@NotNull Rol rol) {
		super();
		this.id = id;
		this.userName = userName;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.dni = dni;
		this.rol = rol;
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
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "EmpleadoDTO [id=" + id + ", userName=" + userName + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", password=" + password + ", dni=" + dni + ", rol=" + rol + "]";
	}


	


}
