package com.spring.resto.resto.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.*;

import com.spring.resto.resto.entity.Marca;

public class BebidaDTO {
	
	@NotBlank
	private Long id;
	
	@NotBlank
	private String nombre;
	
	@NotBlank
	private String descripcion;
	
	@NotNull
	private Date dateCreated;
	
	private Date dateDeleted;
	
	private Marca marca;
	
	@NotNull
	private Float precio;

	
	public BebidaDTO(@NotBlank Long id, @NotBlank String nombre, @NotBlank String descripcion, @NotNull Date fechaAlta,
			Date fechaBaja, Marca marca, @NotNull Float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.dateCreated = fechaAlta;
		this.dateDeleted = fechaBaja;
		this.marca = marca;
		this.precio = precio;
	}

	public BebidaDTO() {
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


	public Marca getMarca() {
		return marca;
	}


	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date fechaAlta) {
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
		return "BebidaDTO [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", dateCreated="
				+ dateCreated + ", dateDeleted=" + dateDeleted + ", marca=" + marca + ", precio=" + precio + "]";
	}


}
