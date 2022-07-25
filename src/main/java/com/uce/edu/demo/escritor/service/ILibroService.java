package com.uce.edu.demo.escritor.service;

import com.uce.edu.demo.escritor.modelo.Libro;

public interface ILibroService {
	
	public void insertar(Libro libro);
	
	public Libro buscar(Integer id);
	
	public void actualizar(Libro libro);
	
	public void eliminar(Integer id);


}
