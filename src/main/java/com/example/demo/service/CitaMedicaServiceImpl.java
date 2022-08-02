package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICitaMedicaRepository;
import com.example.demo.repository.IDoctorRepository;
import com.example.demo.repository.modelo.CitaMedica;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {

	@Autowired
	private ICitaMedicaRepository iCitaMedicaRepository;

	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.iCitaMedicaRepository.insertar(citaMedica);
	}

	

}
