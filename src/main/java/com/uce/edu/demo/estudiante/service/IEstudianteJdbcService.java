package com.uce.edu.demo.estudiante.service;

import com.uce.edu.demo.estudiante.to.EstudianteTo;

public interface IEstudianteJdbcService {
	
	public EstudianteTo buscarPorId(int id);
	
	public void guardar(EstudianteTo estudiante);
	
	public void actualizar(EstudianteTo estudiante);
	
	public void eliminar(int id);

}
