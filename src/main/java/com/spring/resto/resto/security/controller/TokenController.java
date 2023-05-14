package com.spring.resto.resto.security.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.resto.resto.security.entity.Login;

@RestController()
@RequestMapping("/security")
public interface TokenController {
	
	@PostMapping("/login")
	public Map<String,String> login(@Valid @RequestBody Login login);
}
