package com.spring.resto.resto.DTO;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.spring.resto.resto.entity.*;

public class OcupacionDTO {
	
	@NotNull
	private Long id;
	@NotNull
	private LocalDateTime inicio;
	private LocalDateTime fin;
	private List<DetallePlato> detallePlato;
	private List<DetalleBebida> detalleBebida;
	
	public OcupacionDTO(Long id, LocalDateTime inicio, LocalDateTime fin, List<DetallePlato> detallePlato,
			List<DetalleBebida> detalleBebida) {
		super();
		this.id = id;
		this.inicio = inicio;
		this.fin = fin;
		this.detallePlato = detallePlato;
		this.detalleBebida = detalleBebida;
	}

	public OcupacionDTO() {
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
		return "OcupacionDTO [id=" + id + ", inicio=" + inicio + ", fin=" + fin + ", detallePlato=" + detallePlato
				+ ", detalleBebida=" + detalleBebida + "]";
	}
	
	
}
