package com.spring.resto.resto.service.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.spring.resto.resto.DTO.EmpleadoDTO;
import com.spring.resto.resto.DTO.EmpleadoRequestDTO;
import com.spring.resto.resto.entity.Empleado;

public class EmpleadoMapperImplements implements EmpleadoMapper {
	
	@Autowired
	private PasswordEncoder encoder;
	


	@Override
	public EmpleadoDTO map(Empleado empleado) {
		// TODO Auto-generated method stub
		EmpleadoDTO empleadoDTO = new EmpleadoDTO();
		
		empleadoDTO.setId(empleado.getId());
		empleadoDTO.setUserName(empleado.getUserName());
		empleadoDTO.setNombre(empleado.getNombre());
		empleadoDTO.setApellido(empleado.getApellido());
		empleadoDTO.setDni(empleado.getDni());
		empleadoDTO.setPassword(empleado.getPassword());
		empleadoDTO.setRol(empleado.getRol());
		
		
		return empleadoDTO;
	}

	@Override
	public Empleado map(EmpleadoDTO empleadoDTO) {
		// TODO Auto-generated method stub
		Empleado empleado = new Empleado();
		
		empleado.setId(empleadoDTO.getId());
		empleado.setUserName(empleadoDTO.getUserName());
		empleado.setNombre(empleadoDTO.getNombre());
		empleado.setApellido(empleadoDTO.getApellido());
		empleado.setDni(empleadoDTO.getDni());
		empleado.setPassword(empleadoDTO.getPassword());
		empleado.setRol(empleadoDTO.getRol());
		return empleado;
	}

	@Override
	public Empleado map(EmpleadoRequestDTO empleadoDTO) {
		// TODO Auto-generated method stub
		
		System.out.println(empleadoDTO.getPassword());
		
		Empleado empleado = new Empleado();
		empleado.setUserName(empleadoDTO.getUserName());
		empleado.setNombre(empleadoDTO.getNombre());
		empleado.setApellido(empleadoDTO.getApellido());
		empleado.setDni(empleadoDTO.getDni());
		empleado.setPassword(encoder.encode(empleadoDTO.getPassword()));
		empleado.setRol(empleadoDTO.getRol());
		return empleado;
	}

	

}
