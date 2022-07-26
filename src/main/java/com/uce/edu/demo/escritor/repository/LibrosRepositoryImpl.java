package com.uce.edu.demo.escritor.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.escritor.modelo.Libros;

@Repository
@Transactional
public class LibrosRepositoryImpl implements ILibrosRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Libros libro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro);
	}

	@Override
	public Libros buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Libros.class, id);
	}

	@Override
	public void actualizar(Libros libro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(libro);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Libros libro = this.buscar(id);
		this.entityManager.remove(libro);
	}

}
