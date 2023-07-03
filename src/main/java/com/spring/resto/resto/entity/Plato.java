package com.spring.resto.resto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.util.*;

@Entity
@Table(name = "plato")
public class Plato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre",nullable = false)
	private String nombre;
	
	@Column(name="descripcion",nullable = false)
	private String descripcion;
	
	@Column(name="dateCreated",nullable = false)
	private Date dateCreated;
	
	@Column(name="precio",nullable = false)
	private Float precio;
	
	@Column(name="dateDeleted",nullable = true)
	private Date dateDeleted;
	
	@ManyToOne
	@JoinColumn(name = "categoriaId")
	private Categoria categoria;

	public Plato(Long id, String nombre, String descripcion, Date dateCreated, Date dateDeleted,Float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.dateCreated = dateCreated;
		this.dateDeleted = dateDeleted;
		this.precio = precio;
	}

	public Plato() {
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateDeleted() {
		return dateDeleted;
	}

	public void setDateDeleted(Date dateDeleted) {
		this.dateDeleted = dateDeleted;
	}

	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Plato [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", dateCreated="
				+ dateCreated + ", precio=" + precio + ", dateDeleted=" + dateDeleted + ", categoria=" + categoria
				+ "]";
	}

	
	
	
	
	
}
