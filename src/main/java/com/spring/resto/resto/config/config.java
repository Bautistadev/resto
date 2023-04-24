package com.spring.resto.resto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.resto.resto.controller.DetalleBebidaController;
import com.spring.resto.resto.controller.MarcaController;
import com.spring.resto.resto.controller.ProductoController;
import com.spring.resto.resto.controller.delegate.DetalleBebidaApiDelegate;
import com.spring.resto.resto.controller.delegate.MarcaApiDelegate;
import com.spring.resto.resto.controller.delegate.PlatoApiDelegate;
import com.spring.resto.resto.repository.BebidaRepository;
import com.spring.resto.resto.repository.DetalleBebidaRepository;
import com.spring.resto.resto.repository.MarcaRepository;
import com.spring.resto.resto.repository.PlatoRepository;
import com.spring.resto.resto.service.BebidaService;
import com.spring.resto.resto.service.DetalleBebidaService;
import com.spring.resto.resto.service.MarcaService;
import com.spring.resto.resto.service.PlatoService;
import com.spring.resto.resto.service.mapper.BebidaMapper;
import com.spring.resto.resto.service.mapper.BebidaMapperImplements;
import com.spring.resto.resto.service.mapper.DetalleBebidaMapper;
import com.spring.resto.resto.service.mapper.DetalleBebidaMapperImplements;
import com.spring.resto.resto.service.mapper.MarcaMapper;
import com.spring.resto.resto.service.mapper.MarcaMapperImplements;
import com.spring.resto.resto.service.mapper.PlatoMapper;
import com.spring.resto.resto.service.mapper.PlatoMapperImplements;

@Configuration
public class config {
	
	@Bean
	public PlatoMapper getPlatoMapper() {
		return new PlatoMapperImplements();
	}
	
	@Bean
	public PlatoService getPlatoServiceImpl(PlatoRepository platoRepository,PlatoMapper platoMapper) {
		return new PlatoService(platoRepository, platoMapper);
	}
	
	@Bean
	public BebidaMapper getBebidaMapper() {
		return new BebidaMapperImplements();
	}
	
	@Bean 
	public BebidaService getBebidaService(BebidaRepository bebidaRepository, BebidaMapper bebiMapper) {
		return new BebidaService(bebidaRepository, bebiMapper);
	}
	
	@Bean
	public PlatoApiDelegate getProductoController(PlatoService platoService,BebidaService bebidaService) {
		return new ProductoController(platoService,bebidaService);
	}
	
	@Bean
	public MarcaMapper getMarcaMapper() {
		return new MarcaMapperImplements();
	}
	
	@Bean
	public MarcaService getMarcaService(MarcaRepository marcaRepository, MarcaMapper marcaMapper) {
		return new MarcaService(marcaRepository,marcaMapper);
	}
	
	@Bean
	public MarcaApiDelegate getMarcaController(MarcaService marcaService) {
		return new MarcaController(marcaService);
	}
	
	@Bean 
	public DetalleBebidaMapper getDetalleBebidaMapper() {
		return new DetalleBebidaMapperImplements();
	}
	
	@Bean 
	public DetalleBebidaService getDetalleBebidaService(DetalleBebidaMapper bebidaDetalleMapper,DetalleBebidaRepository detalleBebidaRepository) {
		return new DetalleBebidaService(detalleBebidaRepository,bebidaDetalleMapper);
	}
	
	@Bean
	public DetalleBebidaApiDelegate getDetalleBebidaController(DetalleBebidaService detalleBebidaService) {
		return new DetalleBebidaController(detalleBebidaService);
	}
}
