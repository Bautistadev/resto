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

import com.spring.resto.resto.DTO.DetallePlatoDTO;
import com.spring.resto.resto.DTO.DetallePlatoRequestDTO;


@RestController
@RequestMapping("/DetallePlatoController")
public interface DetallePlatoApiDelegate {
	
	@PostMapping("/add")
	public DetallePlatoDTO create(@Valid @RequestBody DetallePlatoRequestDTO requestDTO);
	
	@PutMapping("/update")
	public DetallePlatoDTO update(@Valid @RequestBody DetallePlatoDTO requestDTO);
	
	@GetMapping("/retrive/{id}")
	public DetallePlatoDTO retrive(@PathVariable Long id);
	
	@GetMapping("/retriveAll")
	public List<DetallePlatoDTO>retriveAll();
}
