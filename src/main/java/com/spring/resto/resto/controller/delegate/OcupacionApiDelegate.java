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

import com.spring.resto.resto.DTO.OcupacionDTO;
import com.spring.resto.resto.DTO.OcupacionRequestDTO;

@RestController
@RequestMapping("${api.basePath}/Ocupacion")
public interface OcupacionApiDelegate {
	
	@PostMapping("/add")
	public OcupacionDTO create(@Valid @RequestBody OcupacionRequestDTO request);
	
	@PutMapping("/update")
	public OcupacionDTO update(@Valid @RequestBody OcupacionDTO request);
	
	@GetMapping("/retrive/{id}")
	public OcupacionDTO retrive(@PathVariable Long id);
	
	@GetMapping("/retriveAll")
	public List<OcupacionDTO> retriveAll();
}
