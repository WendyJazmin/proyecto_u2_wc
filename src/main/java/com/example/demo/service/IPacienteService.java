package com.example.demo.service;

import com.example.demo.repository.modelo.Paciente;

public interface IPacienteService {

	public void insertar(Paciente paciente);
	
	public Paciente buscar(Integer id);
	
	public Paciente buscarPorCedula(String cedula);
	
	public void actualizar(Paciente paciente);
	
	public void eliminar(Integer id);

}
