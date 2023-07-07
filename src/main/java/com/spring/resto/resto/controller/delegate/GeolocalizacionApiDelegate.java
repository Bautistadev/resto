package com.spring.resto.resto.controller.delegate;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.resto.resto.DTO.GeolocalizacionDTO;
import com.spring.resto.resto.DTO.GeolocalizacionRequestDTO;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${api.basePath}/Geolocalizacion")
public interface GeolocalizacionApiDelegate {
	
	@PostMapping("/add")
	public GeolocalizacionDTO create (@Valid @RequestBody GeolocalizacionRequestDTO geolocalizacionDTO);
	
	@PutMapping("/update")
	public GeolocalizacionDTO update (@Valid @RequestBody GeolocalizacionDTO geolocalizacionDTO);
	
	@GetMapping("/retriveAll")
	public List<GeolocalizacionDTO> retriveAll();

}
