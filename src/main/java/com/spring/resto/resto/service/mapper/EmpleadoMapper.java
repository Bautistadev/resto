package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.entity.*;
import com.spring.resto.resto.DTO.*;

public interface EmpleadoMapper {

	public EmpleadoDTO map(Empleado empleado);
	public Empleado map(EmpleadoDTO empleadoDTO);
	public Empleado map(EmpleadoRequestDTO empleadoDTO);
}
