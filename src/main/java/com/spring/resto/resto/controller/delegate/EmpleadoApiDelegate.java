package com.spring.resto.resto.controller.delegate;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.resto.resto.DTO.EmpleadoDTO;
import com.spring.resto.resto.DTO.EmpleadoRequestDTO;

@RestController
@RequestMapping("/Empleado")
public interface EmpleadoApiDelegate {
	
	@PostMapping("/add")
	public EmpleadoDTO create(@Valid @RequestBody EmpleadoRequestDTO empleadoDTO);

	@PutMapping("/add")
	public EmpleadoDTO update(@Valid @RequestBody EmpleadoDTO empleadoDTO);
	
	@GetMapping("/retrive/{id}")
	public EmpleadoDTO retrive(@PathVariable Long id);
	
	@GetMapping("/retiveAll")
	public List<EmpleadoDTO> retriveAll();
}
