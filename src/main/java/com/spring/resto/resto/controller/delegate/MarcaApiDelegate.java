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

import com.spring.resto.resto.DTO.MarcaDTO;
import com.spring.resto.resto.DTO.MarcaRequestDTO;

@RestController
@RequestMapping("/Marca")
public interface MarcaApiDelegate {
	
	@PostMapping("/add")
	public MarcaDTO create(@Valid @RequestBody MarcaRequestDTO requestDTO);
	
	@PutMapping("/update")
	public MarcaDTO update(@Valid @RequestBody MarcaDTO requestDTO);
	
	@GetMapping("/retriveAll")
	public List<MarcaDTO>retriveAll();
	
	@GetMapping("/retrive/{id}")
	public MarcaDTO retrive(@PathVariable Long id);
}
