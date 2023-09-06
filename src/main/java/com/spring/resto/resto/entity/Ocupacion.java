package com.spring.resto.resto.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Ocupacion")
public class Ocupacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="inicio",nullable = false)
	private LocalDateTime inicio;
	
	@Column(name="fin",nullable = true)
	private LocalDateTime fin;

	
	@OneToMany(mappedBy = "ocupacion")
	private List<DetallePlato> detallePlato;
	
	@OneToMany(mappedBy = "ocupacion")
	private List<DetalleBebida> detalleBebida;
	
	@ManyToOne
	@JoinColumn(name="mesaId")
	private Mesa mesa;

	public Ocupacion(Long id, LocalDateTime inicio, LocalDateTime fin, Mesa mesa) {
		super();
		this.id = id;
		this.inicio = inicio;
		this.fin = fin;
		this.mesa = mesa;
	}

	public Ocupacion() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFin() {
		return fin;
	}

	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}



	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	
	public List<DetallePlato> getDetallePlato() {
		return detallePlato;
	}

	public void setDetallePlato(List<DetallePlato> detallePlato) {
		this.detallePlato = detallePlato;
	}

	public List<DetalleBebida> getDetalleBebida() {
		return detalleBebida;
	}

	public void setDetalleBebida(List<DetalleBebida> detalleBebida) {
		this.detalleBebida = detalleBebida;
	}

	@Override
	public String toString() {
		return "Ocupacion [id=" + id + ", inicio=" + inicio + ", fin=" + fin 
				+ ", mesa=" + mesa + "]";
	}
	
	
	
	
	

}
