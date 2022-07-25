package com.uce.edu.demo.escritor.service;

import com.uce.edu.demo.escritor.modelo.Autor;

public interface IAutorService {
	
	public void insertar(Autor autor);

	public Autor buscar(Integer id);
	
	public void actualizar(Autor autor);
	
	public void eliminar(Integer id);
}
