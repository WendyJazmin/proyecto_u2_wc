package com.uce.edu.demo.estudiante.service;

import com.uce.edu.demo.estudiante.modelo.Estudiante;

public interface IEstudianteJpaService {

	public Estudiante buscarPorId(Integer id);
	public void guardar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void eliminar(Integer id);
	
}
