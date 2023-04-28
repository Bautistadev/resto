package com.spring.resto.resto.service.mapper;

import com.spring.resto.resto.DTO.EmpleadoDTO;
import com.spring.resto.resto.DTO.EmpleadoRequestDTO;
import com.spring.resto.resto.entity.Empleado;

public class EmpleadoMapperImplements implements EmpleadoMapper {

	@Override
	public EmpleadoDTO map(Empleado empleado) {
		// TODO Auto-generated method stub
		EmpleadoDTO empleadoDTO = new EmpleadoDTO();
		
		empleadoDTO.setId(empleado.getId());
		empleadoDTO.setNombre(empleado.getNombre());
		empleadoDTO.setApellido(empleado.getApellido());
		empleadoDTO.setDni(empleado.getDni());
		empleadoDTO.setPassword(empleado.getPassword());
		
		return empleadoDTO;
	}

	@Override
	public Empleado map(EmpleadoDTO empleadoDTO) {
		// TODO Auto-generated method stub
		Empleado empleado = new Empleado();
		
		empleado.setId(empleadoDTO.getId());
		empleado.setNombre(empleadoDTO.getNombre());
		empleado.setApellido(empleadoDTO.getApellido());
		empleado.setDni(empleadoDTO.getDni());
		empleado.setPassword(empleadoDTO.getPassword());
		
		return empleado;
	}

	@Override
	public Empleado map(EmpleadoRequestDTO empleadoDTO) {
		// TODO Auto-generated method stub
		Empleado empleado = new Empleado();

		empleado.setNombre(empleadoDTO.getNombre());
		empleado.setApellido(empleadoDTO.getApellido());
		empleado.setDni(empleadoDTO.getDni());
		empleado.setPassword(empleadoDTO.getPassword());
		
		return empleado;
	}

	

}
