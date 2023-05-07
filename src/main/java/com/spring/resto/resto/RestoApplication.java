package com.spring.resto.resto;

import org.springframework.boot.SpringApplication;

import com.spring.resto.resto.DTO.PlatoDTO;
import com.spring.resto.resto.DTO.PlatoRequestDTO;
import com.spring.resto.resto.entity.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.resto.resto.service.PlatoService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.spring.resto.resto"})
@EnableAutoConfiguration

public class RestoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  SpringApplication.run(RestoApplication.class, args);
		
		
		
	}

}
