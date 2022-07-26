package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IAutor2Repository;
import com.uce.edu.demo.repository.ILibro2Repository;
import com.uce.edu.demo.repository.ILibroRepository;
import com.uce.edu.demo.repository.modelo.manytomany.Libro;
import com.uce.edu.demo.repository.modelo.onetomany.Autor2;
import com.uce.edu.demo.repository.modelo.onetomany.Libro2;

@Service
public class Autor2ServiceImpl implements IAutor2Service{

	@Autowired
	private IAutor2Repository iAutor2Repository;

	@Override
	public void insertar(Autor2 autor2) {
		// TODO Auto-generated method stub
		this.iAutor2Repository.insertar(autor2);
	}

	
	

}