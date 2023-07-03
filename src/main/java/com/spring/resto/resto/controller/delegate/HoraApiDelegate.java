package com.spring.resto.resto.controller.delegate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api.basePath}/Hora")
public interface HoraApiDelegate {
	
	@GetMapping("/retriveHora")
	public String retriveHora();
	
}