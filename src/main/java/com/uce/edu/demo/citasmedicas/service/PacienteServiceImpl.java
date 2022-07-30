package com.uce.edu.demo.citasmedicas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.citasmedicas.modelo.Paciente;
import com.uce.edu.demo.citasmedicas.repository.IDoctorRepository;
import com.uce.edu.demo.citasmedicas.repository.IPacienteRepository;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepository iPacienteRepository;
	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.insertar(paciente);
	}

	
}
