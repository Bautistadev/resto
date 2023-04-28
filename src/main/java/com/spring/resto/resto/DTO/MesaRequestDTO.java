package com.spring.resto.resto.DTO;
import javax.validation.constraints.NotBlank;

import com.spring.resto.resto.entity.*;


public class MesaRequestDTO {
	
	@NotBlank
	private String token;
	private boolean estado;
	private Empleado empleado;
	
	public MesaRequestDTO(@NotBlank String token, boolean estado, Empleado empleado) {
		super();
		this.token = token;
		this.estado = estado;
		this.empleado = empleado;
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
	public Empleado getEmpleado() {
		return this.empleado;
	}
	public void setEmpleado(Empleado persona) {
		this.empleado = persona;
	}
	@Override
	public String toString() {
		return "MesaRequestDTO [token=" + token + ", estado=" + estado + ", empleado=" + empleado + "]";
	}
	
	
	
	
}
