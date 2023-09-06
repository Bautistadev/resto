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
	private Empleado empleado;
	private Geolocalizacion geolocalizacion;
	
	public MesaDTO(Long id, String token, boolean estado, Empleado empleado,Geolocalizacion geolocalizacion) {
		super();
		this.id = id;
		this.token = token;
		this.estado = estado;
		this.empleado = empleado;
		this.geolocalizacion = geolocalizacion;
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
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setPersona(Empleado empleado) {
		this.empleado = empleado;
	}
	
	public Geolocalizacion getGeolocalizacion() {
		return geolocalizacion;
	}
	public void setGeolocalizacion(Geolocalizacion geolocalizacion) {
		this.geolocalizacion = geolocalizacion;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	@Override
	public String toString() {
		return "MesaDTO [id=" + id + ", token=" + token + ", estado=" + estado + ", persona=" + empleado + "]";
	}
	
	
	
}
