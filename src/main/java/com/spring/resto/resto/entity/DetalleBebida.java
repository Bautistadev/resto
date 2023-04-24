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
@Table(name = "DetalleBebida")
public class DetalleBebida {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, name = "cantidad")
	private Integer cantidad;
	
	@ManyToOne
	@JoinColumn(name = "bebidaId")
	private Bebida bebida;
	
	@ManyToOne
	@JoinColumn(name = "ocupacionId")
	private Ocupacion ocupacion;

	public DetalleBebida(Long id, Integer cantidad, Bebida bebida, Ocupacion ocupacion) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.bebida = bebida;
		this.ocupacion = ocupacion;
	}
	

	public DetalleBebida() {
		super();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public Ocupacion getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(Ocupacion ocupacion) {
		this.ocupacion = ocupacion;
	}


	@Override
	public String toString() {
		return "DetalleBebida [id=" + id + ", cantidad=" + cantidad + ", bebida=" + bebida + ", ocupacion=" + ocupacion
				+ "]";
	}
	
	
	

	
}
