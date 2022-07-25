package com.uce.edu.demo.escritor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.escritor.modelo.Autor;
import com.uce.edu.demo.escritor.repository.IAutorRepository;

@Service
public class AutorServiceImpl implements IAutorService{

	@Autowired
	private IAutorRepository iAutorRepository;
	
	@Override
	public void insertar(Autor autor) {
		// TODO Auto-generated method stub
		this.iAutorRepository.insertar(autor);
	}

	@Override
	public Autor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iAutorRepository.buscar(id);
	}

	@Override
	public void actualizar(Autor autor) {
		// TODO Auto-generated method stub
		this.iAutorRepository.actualizar(autor);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iAutorRepository.eliminar(id);
	}

}
