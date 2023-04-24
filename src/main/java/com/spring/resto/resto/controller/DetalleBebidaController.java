package com.spring.resto.resto.controller;

import java.util.List;

import javax.validation.Valid;

import com.spring.resto.resto.DTO.DetalleBebidaDTO;
import com.spring.resto.resto.DTO.DetalleBebidaRequestDTO;
import com.spring.resto.resto.controller.delegate.DetalleBebidaApiDelegate;
import com.spring.resto.resto.service.DetalleBebidaService;

public class DetalleBebidaController implements DetalleBebidaApiDelegate {
	
	
	private DetalleBebidaService detalleBebidaService;

	public DetalleBebidaController(DetalleBebidaService detalleBebidaService) {
		super();
		this.detalleBebidaService = detalleBebidaService;
	}

	@Override
	public DetalleBebidaDTO create(@Valid DetalleBebidaRequestDTO request) {
		// TODO Auto-generated method stub
		try {
			return detalleBebidaService.create(request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public DetalleBebidaDTO update(@Valid DetalleBebidaDTO request) {
		// TODO Auto-generated method stub
		
		try {
			return detalleBebidaService.update(request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<DetalleBebidaDTO> retriveAll() {
		// TODO Auto-generated method stub
		
		try {
			return detalleBebidaService.retriveAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public DetalleBebidaDTO retrive(Long id) {
		// TODO Auto-generated method stub
		try {
			return detalleBebidaService.retrive(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
