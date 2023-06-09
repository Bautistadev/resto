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

import com.spring.resto.resto.DTO.ClienteDTO;
import com.spring.resto.resto.DTO.ClienteRequestDTO;

@RestController
@RequestMapping("${api.basePath}/Cliente")
public interface ClienteApiDelegate {
	
	@PostMapping("/add")
	public ClienteDTO create(@Valid @RequestBody ClienteRequestDTO requestDTO);
	
	@PutMapping("/update")
	public ClienteDTO update(@Valid @RequestBody ClienteDTO requestDTO);
	
	@GetMapping("/retrive/{id}")
	public ClienteDTO retrive(@PathVariable Long id);
	
	@GetMapping("/retriveAll")
	public List<ClienteDTO> retriveAll();
	
}
