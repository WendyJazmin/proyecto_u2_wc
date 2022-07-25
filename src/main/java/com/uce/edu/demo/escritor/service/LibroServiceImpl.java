package com.uce.edu.demo.escritor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.escritor.modelo.Libro;
import com.uce.edu.demo.escritor.repository.ILibroRepository;

@Service
public class LibroServiceImpl implements ILibroService{

	@Autowired
	private ILibroRepository iLibroRepository;
	
	@Override
	public void insertar(Libro libro) {
		// TODO Auto-generated method stub
		this.iLibroRepository.insertar(libro);
	}
	@Override
	public Libro buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iLibroRepository.buscar(id);
	}
	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
		this.iLibroRepository.actualizar(libro);
	}
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iLibroRepository.eliminar(id);
	}

}
