package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.manytomany.Libro;
import com.uce.edu.demo.repository.modelo.onetomany.Libro2;
import com.uce.edu.demo.repository.modelo.onetomany.Libro2_Autor2;

@Repository
@Transactional
public class Libro2_Autor2RepositoryImpl implements ILibro2_Autor2Repository{


	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Libro2_Autor2 libro2_autor2) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro2_autor2);
	}

	
	

}
