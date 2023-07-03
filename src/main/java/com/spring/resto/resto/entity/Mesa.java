package com.spring.resto.resto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mesas")
public class Mesa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "token",nullable = false)
	private String token;
	
	@Column(name = "estado",nullable = false)
	private boolean estado;
	
	@ManyToOne
	@JoinColumn(name="empleadoId")
	private Empleado empleado;
	
	public Mesa() {
		super();
	}
	
	public Mesa(Long id, String token, boolean estado, Empleado empleado) {
		super();
		this.id = id;
		this.token = token;
		this.estado = estado;
		this.empleado = empleado;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Empleado getPersona() {
		return this.empleado;
	}

	public void setPersona(Empleado empleado) {
		this.empleado= empleado;
	}

	@Override
	public String toString() {
		return "Mesa [id=" + id + ", token=" + token + ", estado=" + estado + ", empleado=" + empleado + "]";
	}
	
	
	
	
	
}
