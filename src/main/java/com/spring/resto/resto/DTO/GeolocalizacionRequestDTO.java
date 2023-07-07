package com.spring.resto.resto.DTO;

import javax.validation.constraints.NotNull;

public class GeolocalizacionRequestDTO {

	@NotNull
	private Float x1;
	@NotNull
	private Float x2;
	@NotNull
	private Float x3;
	@NotNull
	private Float x4;
	
	@NotNull
	private Float y1;
	@NotNull
	private Float y2;
	@NotNull
	private Float y3;
	@NotNull
	private Float y4;
	


	public GeolocalizacionRequestDTO( @NotNull Float x1, @NotNull Float x2, @NotNull Float x3,
			@NotNull Float x4, @NotNull Float y1, @NotNull Float y2, @NotNull Float y3, @NotNull Float y4) {
		super();
	
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
	}


	public GeolocalizacionRequestDTO() {
		super();
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
		return "Geolocalizacion [x1=" + x1 + ", x2=" + x2 + ", x3=" + x3 + ", x4=" + x4 + ", y1=" + y1
				+ ", y2=" + y2 + ", y3=" + y3 + ", y4=" + y4 + "]";
	}

}
