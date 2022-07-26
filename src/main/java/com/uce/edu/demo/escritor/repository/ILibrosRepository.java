package com.uce.edu.demo.escritor.repository;

import com.uce.edu.demo.escritor.modelo.Libros;

public interface ILibrosRepository {
	
	public void insertar(Libros libro);
	
	public Libros buscar(Integer id);
	
	public void actualizar(Libros libro);
	
	public void eliminar(Integer id);

}
