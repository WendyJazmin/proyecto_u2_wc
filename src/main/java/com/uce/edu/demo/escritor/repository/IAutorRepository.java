package com.uce.edu.demo.escritor.repository;

import com.uce.edu.demo.escritor.modelo.Autors;

public interface IAutorRepository {

	public void insertar(Autors autor);
	
	public Autors buscar(Integer id);
	
	public void actualizar(Autors autor);
	
	public void eliminar(Integer id);
}
