package com.spring.resto.resto.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Bebida {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre",nullable = false)
	private String nombre;
	
	@Column(name = "descripcion",nullable = false)
	private String descripcion;
	
	@Column(name = "fechaAlta",nullable = false)
	private Date dateCreated;
	
	@Column(name = "fechaBaja",nullable = true)
	private Date dateDeleted;
	
	@Column(name = "precio",nullable =false)
	private Float precio;
	
	@ManyToOne
	@JoinColumn(name = "marcaId")
	private Marca marca;
	

	public Bebida() {
		super();
	}
	

	public Bebida(Long id, String nombre, String descripcion, Date fechaAlta, Date fechaBaja, Marca marca, Float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.dateCreated = fechaAlta;
		this.dateDeleted = fechaBaja;
		this.marca = marca;
		this.precio = precio;
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

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	

	public Date getDateCreated() {
		return dateCreated;
	}


	public void setdateCreated(Date fechaAlta) {
		this.dateCreated = fechaAlta;
	}


	public Date getDateDeleted() {
		return dateDeleted;
	}


	public void setDateDeleted(Date fechaBaja) {
		this.dateDeleted = fechaBaja;
	}
	
	

	public Float getPrecio() {
		return precio;
	}


	public void setPrecio(Float precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Bebida [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", dateCreated="
				+ dateCreated + ", dateDeleted=" + dateDeleted + ", precio=" + precio + ", marca=" + marca + "]";
	}


	

	
	
	
	
}
