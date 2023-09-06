package com.spring.resto.resto.controller.delegate;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.spring.resto.resto.DTO.PlatoDTO;
import com.spring.resto.resto.DTO.PlatoRequestDTO;

import io.swagger.v3.oas.annotations.Operation;



@RestController
@RequestMapping("${api.basePath}/Plato")
public interface PlatoApiDelegate {
	
	@GetMapping("/retriveAllPlato")
	public List<PlatoDTO> retriveAllPlato();
	
	@GetMapping("/retrivePlato/{id}")
	public PlatoDTO retrivePlato(@PathVariable Long id);
	
	@PostMapping("/addPlato")
	public PlatoDTO createPlato(@Valid @RequestBody PlatoRequestDTO plato);
	
	@PutMapping("/updatePlato")
	public PlatoDTO updatePlato(@Valid @RequestBody PlatoDTO requestDTO);
	
	@DeleteMapping("/removePlato")
	public String removePlato( @Valid @RequestBody PlatoDTO requestDTO);
	
	

}
