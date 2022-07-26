package com.uce.edu.demo.escritor.service;

import com.uce.edu.demo.escritor.modelo.Libros;

public interface ILibrosService {
	
	public void insertar(Libros libro);
	
	public Libros buscar(Integer id);
	
	public void actualizar(Libros libro);
	
	public void eliminar(Integer id);


}
