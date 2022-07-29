package com.uce.edu.demo.matriculacion.service;

import com.uce.edu.demo.matriculacion.modelo.Matricula;

public interface IMatriculaGestorService {
	
	public void generarMatricula(String cedula, String placa);
	
	public Matricula buscar(Integer id);

}
