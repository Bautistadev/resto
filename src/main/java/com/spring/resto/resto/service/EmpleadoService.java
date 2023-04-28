package com.spring.resto.resto.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.spring.resto.resto.DTO.DetallePlatoDTO;
import com.spring.resto.resto.DTO.EmpleadoDTO;
import com.spring.resto.resto.DTO.EmpleadoRequestDTO;
import com.spring.resto.resto.entity.DetallePlato;
import com.spring.resto.resto.entity.Empleado;
import com.spring.resto.resto.repository.EmpleadoRepository;
import com.spring.resto.resto.service.mapper.EmpleadoMapper;

public class EmpleadoService {

	private EmpleadoMapper empleadoMapper;
	private EmpleadoRepository empleadoRepository;
	
	public EmpleadoService(EmpleadoMapper empleadoMapper, EmpleadoRepository empleadoRepository) {
		super();
		this.empleadoMapper = empleadoMapper;
		this.empleadoRepository = empleadoRepository;
	}
	
	public EmpleadoDTO create(EmpleadoRequestDTO requestDTO) {
		
		Empleado empleado = this.empleadoMapper.map(requestDTO);
		
		this.empleadoRepository.save(empleado);
		
		return this.empleadoMapper.map(empleado);
		
	}
	
	public EmpleadoDTO update(EmpleadoDTO requestDTO) {
		
		Empleado empleado = this.empleadoMapper.map(requestDTO);
		
		this.empleadoRepository.save(empleado);
		
		return this.empleadoMapper.map(empleado);
		
	}
	
	public EmpleadoDTO retrive(Long id) {
		
		Empleado empleado = this.empleadoRepository.findById(id).get();
		
		return this.empleadoMapper.map(empleado);
		
	}
	
	public List<EmpleadoDTO> retriveAll() {
		Iterable<Empleado> empleadoIterable = this.empleadoRepository.findAll();
		Iterator<Empleado> empleadoIterator = empleadoIterable.iterator();
		List<EmpleadoDTO> listaEmpleado = new ArrayList<>();
		
		while(empleadoIterator.hasNext())
			listaEmpleado.add(empleadoMapper.map(empleadoIterator.next()));
		
		return listaEmpleado;
		
	}
	
}
