package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICitaMedicaRepository;
import com.example.demo.repository.IDoctorRepository;
import com.example.demo.repository.IPacienteRepository;
import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;


@Service
public class GestorCitaMedicaServiceImpl implements IGestorCitaMedicaService {

	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	
	@Autowired
	private IPacienteRepository ipacienteRepository;
	
	@Autowired
	private IDoctorRepository idoctorRepository;



	@Override
	public void generarCita(String numero, LocalDateTime fechaCita, BigDecimal valor, String lugar, String cedulaDoctor,
			String cedulaPaciente) {
		// TODO Auto-generated method stub
		
		Doctor doc = this.idoctorRepository.buscarPorCedula(cedulaDoctor);
		
		Paciente paciente = this.ipacienteRepository.buscarPorCedula(cedulaPaciente);
		
		CitaMedica cita = new CitaMedica();
		cita.setNumeroCita(numero);
		cita.setFechaCita(fechaCita);
		cita.setValorCita(valor);
		cita.setLugarCita(lugar);
		
		cita.setDoctor(doc);
		cita.setPaciente(paciente);
		
		this.citaMedicaService.insertar(cita);
	}



	@Override
	public void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime fechaProximaCita) {
		// TODO Auto-generated method stub
		CitaMedica cita = this.citaMedicaRepository.buscarPorNumero(numero);
		cita.setDiagnostico(diagnostico);
		cita.setReceta(receta);
		cita.setFechaProximaCita(fechaProximaCita);
		
		this.citaMedicaRepository.actualizar(cita);
	}
	
	
	

}
