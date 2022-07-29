package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.modelo.Matricula;

public interface IMatriculaJpaRepository {

	public void crear(Matricula matricula);
	
	public Matricula buscar(Integer id);
}
