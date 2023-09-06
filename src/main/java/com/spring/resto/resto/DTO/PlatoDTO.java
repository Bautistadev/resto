package com.spring.resto.resto.DTO;


import java.util.Arrays;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.spring.resto.resto.entity.Categoria;

public class PlatoDTO {
	
	@NotNull
	private Long id;
	
	@NotBlank
	private String nombre;
	
	@NotBlank
	private String descripcion;
	
	@NotNull
	private Float precio;
	
	@NotNull
	private Date dateCreated;
	
	private Date dateDeleted;
	
	@NotNull
	private Categoria categoria;
	

	

	public PlatoDTO(@NotBlank Long id, @NotBlank String nombre, @NotBlank String descripcion,
			@NotBlank Date dateCreated, Date dateDeleted,Categoria categoria, @NotNull Float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.dateCreated = dateCreated;
		this.dateDeleted = dateDeleted;
		this.categoria = categoria;
		this.precio = precio;
	}
	
	



	public PlatoDTO() {
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
		return "PlatoDTO [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", dateCreated=" + dateCreated + ", dateDeleted=" + dateDeleted + ", categoria=" + categoria + "]";
	}


	
	
}
