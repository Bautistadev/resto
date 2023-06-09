package com.spring.resto.resto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name  = "Geolocalizacion")
public class Geolocalizacion {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, name = "x1")
	private Float x1;
	@Column(nullable = false, name = "x2")
	private Float x2;
	@Column(nullable = false, name = "x3")
	private Float x3;
	@Column(nullable = false, name = "x4")
	private Float x4;
	
	@Column(nullable = false, name = "y1")
	private Float y1;
	@Column(nullable = false, name = "y2")
	private Float y2;
	@Column(nullable = false, name = "y3")
	private Float y3;
	@Column(nullable = false, name = "y4")
	private Float y4;
	
	
	public Geolocalizacion(Long id, Float x1, Float x2, Float x3, Float x4, Float y1, Float y2, Float y3, Float y4) {
		super();
		this.id = id;
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
	}


	public Geolocalizacion() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Float getX1() {
		return x1;
	}


	public void setX1(Float x1) {
		this.x1 = x1;
	}


	public Float getX2() {
		return x2;
	}


	public void setX2(Float x2) {
		this.x2 = x2;
	}


	public Float getX3() {
		return x3;
	}


	public void setX3(Float x3) {
		this.x3 = x3;
	}


	public Float getX4() {
		return x4;
	}


	public void setX4(Float x4) {
		this.x4 = x4;
	}


	public Float getY1() {
		return y1;
	}


	public void setY1(Float y1) {
		this.y1 = y1;
	}


	public Float getY2() {
		return y2;
	}


	public void setY2(Float y2) {
		this.y2 = y2;
	}


	public Float getY3() {
		return y3;
	}


	public void setY3(Float y3) {
		this.y3 = y3;
	}


	public Float getY4() {
		return y4;
	}


	public void setY4(Float y4) {
		this.y4 = y4;
	}


	@Override
	public String toString() {
		return "Geolocalizacion [id=" + id + ", x1=" + x1 + ", x2=" + x2 + ", x3=" + x3 + ", x4=" + x4 + ", y1=" + y1
				+ ", y2=" + y2 + ", y3=" + y3 + ", y4=" + y4 + "]";
	}
	
	
	
	
	
	
	
	
	
}
