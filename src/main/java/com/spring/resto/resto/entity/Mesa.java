package com.spring.resto.resto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mesas")
public class Mesa {
	
	@Id
	private Long id;
	
	@Column(name = "token",nullable = false)
	private String token;
	
	@Column(name = "estado",nullable = false)
	private boolean estado;
	
	@ManyToOne
	@JoinColumn(name="personaId")
	private persona persona;
	
	public Mesa() {
		super();
	}
	
	public Mesa(Long id, String token, boolean estado, com.spring.resto.resto.entity.persona persona) {
		super();
		this.id = id;
		this.token = token;
		this.estado = estado;
		this.persona = persona;
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

	public persona getPersona() {
		return persona;
	}

	public void setPersona(persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Mesa [id=" + id + ", token=" + token + ", estado=" + estado + ", persona=" + persona + "]";
	}
	
	
	
	
	
}
