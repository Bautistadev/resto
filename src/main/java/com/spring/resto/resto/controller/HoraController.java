package com.spring.resto.resto.controller;

import com.spring.resto.resto.controller.delegate.HoraApiDelegate;
import com.spring.resto.resto.service.HoraService;

public class HoraController implements HoraApiDelegate{
	
	private HoraService horaService;
	

	public HoraController(HoraService horaService) {
		super();
		this.horaService = horaService;
	}


	@Override
	public String retriveHora() {
		// TODO Auto-generated method stub
		return this.horaService.getHora();
	}

}
