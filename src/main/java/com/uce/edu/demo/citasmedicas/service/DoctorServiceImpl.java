package com.uce.edu.demo.citasmedicas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.citasmedicas.modelo.Doctor;
import com.uce.edu.demo.citasmedicas.repository.IDoctorRepository;


@Service
public class DoctorServiceImpl implements IDoctorService{

	@Autowired
	private IDoctorRepository iDoctorRepository;
	
	@Override
	public void insertar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.iDoctorRepository.insertar(doctor);
	}

}
