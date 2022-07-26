package com.uce.edu.demo.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ILibro2_Autor2Repository;
import com.uce.edu.demo.repository.modelo.manytomany.Libro;
import com.uce.edu.demo.repository.modelo.onetomany.Libro2;
import com.uce.edu.demo.repository.modelo.onetomany.Libro2_Autor2;

@Service
public class Libro2_Autor2ServiceImpl implements ILibro2_Autor2Service{


	@Autowired
	private ILibro2_Autor2Repository iLibro2_Autor2Repository;

	@Override
	public void insertar(Libro2_Autor2 libro2_autor2) {
		// TODO Auto-generated method stub
		this.iLibro2_Autor2Repository.insertar(libro2_autor2);
	}

	
	

}
