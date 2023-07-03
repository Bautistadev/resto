package com.spring.resto.resto.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.spring.resto.resto.security.entity.Rol;

public class EmpleadoRequestDTO {
	
	@NotBlank
	private String userName;
	@NotBlank
	private String nombre;
	@NotBlank
	private String apellido;
	@NotNull
	private Integer dni;
	@NotBlank
	private String password;
	@NotNull
	private Rol rol;
	
	public EmpleadoRequestDTO(@NotBlank String userName, @NotBlank String nombre, @NotBlank String apellido,
			@NotNull Integer dni, @NotBlank String password,@NotBlank Rol rol) {
		super();
		this.userName = userName;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.password = password;
		this.rol = rol;
	}
	public EmpleadoRequestDTO() {
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
		return "EmpleadoRequestDTO [userName=" + userName + ", nombre=" + nombre + ", apellido=" + apellido + ", dni="
				+ dni + ", password=" + password + ", rol=" + rol + "]";
	}
	
	
	
}
