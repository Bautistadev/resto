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


import com.spring.resto.resto.DTO.*;
import com.spring.resto.resto.service.*;

@RestController
@RequestMapping("/DetalleBebidaController")
public interface DetalleBebidaApiDelegate {
	
	@PostMapping("/add")
	public DetalleBebidaDTO create(@Valid @RequestBody DetalleBebidaRequestDTO request);

	@PutMapping("/update")
	public DetalleBebidaDTO update(@Valid @RequestBody DetalleBebidaDTO request);
	
	@GetMapping("/retriveAll")
	public List<DetalleBebidaDTO> retriveAll();
	
	@GetMapping("/retrive/{id}")
	public DetalleBebidaDTO retrive(@PathVariable Long id);
	
}
