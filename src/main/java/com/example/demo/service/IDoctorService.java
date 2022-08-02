package com.example.demo.service;

import com.example.demo.repository.modelo.Doctor;

public interface IDoctorService {
	
	public void insertar(Doctor doctor);
	
	public Doctor buscar(Integer id);
	
	public Doctor buscarPorCedula(String cedula);
	
	public void actualizar(Doctor doctor);
	
	public void eliminar(Integer id);

}