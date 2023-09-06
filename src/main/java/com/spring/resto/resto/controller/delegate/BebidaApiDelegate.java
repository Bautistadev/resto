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
import org.springframework.web.multipart.MultipartFile;

import com.spring.resto.resto.DTO.BebidaDTO;
import com.spring.resto.resto.DTO.BebidaRequestDTO;
import com.spring.resto.resto.DTO.PlatoDTO;
import com.spring.resto.resto.DTO.PlatoRequestDTO;

@RestController
@RequestMapping("${api.basePath}/Bebida")
public interface BebidaApiDelegate {
	
	@GetMapping("/retriveAllBebida")
	public List<BebidaDTO> retriveAllBebida();
	
	@GetMapping("/retriveBebida/{id}")
	public BebidaDTO retriveBebida(@PathVariable Long id);
	
	@PostMapping("/addBebida")
	public BebidaDTO createBebida(@Valid @RequestBody BebidaRequestDTO requestDTP);
	
	@PutMapping("/updateBebida")
	public BebidaDTO updateBebida(@Valid @RequestBody BebidaDTO requestDTO);
	
	@DeleteMapping("/removeBebida")
	public String removeBebida( @Valid @RequestBody BebidaDTO requestDTO);


	


}
