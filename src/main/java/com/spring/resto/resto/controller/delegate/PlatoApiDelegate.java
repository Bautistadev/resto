package com.spring.resto.resto.controller.delegate;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.resto.resto.DTO.PlatoDTO;
import com.spring.resto.resto.DTO.PlatoRequestDTO;



@RestController
@RequestMapping("/PlatoApi")
public interface PlatoApiDelegate {
	
	@GetMapping("/retriveAllPlato")
	public List<PlatoDTO> retriveAllPlato();
	
	@GetMapping("/retrivePlato/{id}")
	public PlatoDTO retrivePlato(@PathVariable Long id);
	
	@PostMapping("/addPlato")
	public PlatoDTO createPlato(@Valid @RequestBody PlatoRequestDTO request);
	
	@PutMapping("/updatePlato")
	public PlatoDTO updatePlato(@Valid @RequestBody PlatoDTO requestDTO);
	
	@DeleteMapping("/removePlato")
	public String removePlato( @Valid @RequestBody PlatoDTO requestDTO);
	
	

}
