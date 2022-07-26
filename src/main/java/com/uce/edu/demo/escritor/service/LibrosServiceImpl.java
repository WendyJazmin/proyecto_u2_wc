package com.uce.edu.demo.escritor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.escritor.modelo.Libros;
import com.uce.edu.demo.escritor.repository.ILibrosRepository;

@Service
public class LibrosServiceImpl implements ILibrosService{

	@Autowired
	private ILibrosRepository iLibroRepository;
	
	@Override
	public void insertar(Libros libro) {
		// TODO Auto-generated method stub
		this.iLibroRepository.insertar(libro);
	}
	@Override
	public Libros buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iLibroRepository.buscar(id);
	}
	@Override
	public void actualizar(Libros libro) {
		// TODO Auto-generated method stub
		this.iLibroRepository.actualizar(libro);
	}
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iLibroRepository.eliminar(id);
	}

}
