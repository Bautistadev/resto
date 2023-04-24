package com.spring.resto.resto.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.spring.resto.resto.enums.PorcionEnum;

@Entity
@Table(name="porciones")
public class Porcion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private PorcionEnum porcion;

	
	public Porcion() {
		super();
	}

	public Porcion(Long id, @NotNull PorcionEnum porcion) {
		super();
		this.id = id;
		this.porcion = porcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PorcionEnum getPorcion() {
		return porcion;
	}

	public void setPorcion(PorcionEnum porcion) {
		this.porcion = porcion;
	}

	@Override
	public String toString() {
		return "Porcion [id=" + id + ", porcion=" + porcion + "]";
	}
	
	
}
