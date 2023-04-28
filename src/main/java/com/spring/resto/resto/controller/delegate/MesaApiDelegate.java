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

import com.spring.resto.resto.DTO.MesaDTO;
import com.spring.resto.resto.DTO.MesaRequestDTO;

@RestController
@RequestMapping("/Mesa")
public interface MesaApiDelegate {

	@PostMapping("/add")
	public MesaDTO create(@Valid @RequestBody MesaRequestDTO requestDTO);
	
	@PutMapping("/update")
	public MesaDTO update(@Valid @RequestBody MesaDTO requestDTO);
	
	@GetMapping("/retrive/{id}")
	public MesaDTO retrive(@PathVariable Long id);
	
	@GetMapping("/retriveAll")
	public List<MesaDTO> retriveAll();
	
}
