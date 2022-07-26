package com.uce.edu.demo.escritor.service;

import com.uce.edu.demo.escritor.modelo.Autors;

public interface IAutorService {
	
	public void insertar(Autors autor);

	public Autors buscar(Integer id);
	
	public void actualizar(Autors autor);
	
	public void eliminar(Integer id);
}
