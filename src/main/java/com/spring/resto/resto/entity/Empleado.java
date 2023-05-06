package com.spring.resto.resto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.spring.resto.resto.security.entity.Rol;

@Entity
@Table(name = "Empleado")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "userName",nullable = false)
	private String userName;
	
	@Column(name = "nombre",nullable = false)
	private String nombre;
	
	@Column(name = "apellido",nullable = false)
	private String apellido;
	
	@Column(name = "dni",nullable = false)
	private Integer dni;
	
	@Column(name = "password",nullable = false)
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "rolId")
	private Rol rol;

	public Empleado(Long id, String userName, String nombre, String apellido, Integer dni, String password, Rol rol) {
		super();
		this.id = id;
		this.userName = userName;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.password = password;
		this.rol = rol;
	}

	public Empleado() {
		super();
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
		return "Empleado [id=" + id + ", userName=" + userName + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", dni=" + dni + ", password=" + password + ", rol=" + rol + "]";
	}


}
