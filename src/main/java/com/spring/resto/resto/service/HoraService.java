package com.spring.resto.resto.service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HoraService {

	public String getHora() {
		
		//INSTANCIAMOS LA CLASE QUE NOS DA LA HORA 
		LocalTime hora = LocalTime.now();
		
		//DEFINIMOS UN FORMATO : HH:mm:ss
		DateTimeFormatter formarto = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		//LE SETEAMOS EL FORMATO
		return hora.format(formarto);
	}	
	
}
