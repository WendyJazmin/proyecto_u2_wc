package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.repository.modelo.Paciente;
import com.example.demo.repository.modelo.PacienteSencillo;

public interface IPacienteService {

	public void insertar(Paciente paciente);
	
	public Paciente buscar(Integer id);
	
	public Paciente buscarPorCedula(String cedula);
	
	public void actualizar(Paciente paciente);
	
	public void eliminar(Integer id);
	
	public List<PacienteSencillo> buscarPacienteSencillo(LocalDateTime fecha, String genero);

}
