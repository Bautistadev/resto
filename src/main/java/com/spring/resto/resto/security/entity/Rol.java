package com.spring.resto.resto.security.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Rol")
public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private com.spring.resto.resto.security.enums.Rol rol;

	public Rol(Long id, com.spring.resto.resto.security.enums.Rol rol) {
		super();
		this.id = id;
		this.rol = rol;
	}

	public Rol() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public com.spring.resto.resto.security.enums.Rol getRol() {
		return rol;
	}

	public void setRol(com.spring.resto.resto.security.enums.Rol rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Rol [id=" + id + ", rol=" + rol + "]";
	}

	public String name() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
