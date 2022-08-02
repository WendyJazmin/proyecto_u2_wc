package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorCitaMedicaService {
	
	public void generarCita(String numero,LocalDateTime fechaCita,BigDecimal valor,
			String lugar, String cedulaDoctor,String cedulaPaciente);

	public void actualizarCita(String numero, String diagnostico, String receta,LocalDateTime fechaProximaCita);
}
