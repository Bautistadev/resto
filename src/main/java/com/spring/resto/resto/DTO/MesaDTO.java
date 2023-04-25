package com.spring.resto.resto.DTO;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.spring.resto.resto.entity.*;

public class MesaDTO {
	
	@NotNull
	private Long id;
	@NotBlank
	private String token;
	private boolean estado;
	private persona persona;
	
	public MesaDTO(Long id, String token, boolean estado, com.spring.resto.resto.entity.persona persona) {
		super();
		this.id = id;
		this.token = token;
		this.estado = estado;
		this.persona = persona;
	}
	public MesaDTO() {
		super();
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
		return "MesaDTO [id=" + id + ", token=" + token + ", estado=" + estado + ", persona=" + persona + "]";
	}
	
	
	
}
