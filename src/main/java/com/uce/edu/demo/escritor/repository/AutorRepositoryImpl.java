package com.uce.edu.demo.escritor.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.escritor.modelo.Autors;

@Repository
@Transactional
public class AutorRepositoryImpl implements IAutorRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Autors autor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(autor);
	}

	@Override
	public Autors buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Autors.class, id);
	}

	@Override
	public void actualizar(Autors autor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(autor);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Autors autor = this.buscar(id);
		this.entityManager.remove(autor);
		
	}

}
