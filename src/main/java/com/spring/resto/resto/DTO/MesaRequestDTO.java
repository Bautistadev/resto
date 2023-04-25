package com.spring.resto.resto.DTO;
import javax.validation.constraints.NotBlank;

import com.spring.resto.resto.entity.*;


public class MesaRequestDTO {
	
	@NotBlank
	private String token;
	private boolean estado;
	private persona persona;
	
	public MesaRequestDTO(@NotBlank String token, boolean estado, com.spring.resto.resto.entity.persona persona) {
		super();
		this.token = token;
		this.estado = estado;
		this.persona = persona;
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
		return "MesaRequestDTO [token=" + token + ", estado=" + estado + ", persona=" + persona + "]";
	}
	
	
	
	
}
