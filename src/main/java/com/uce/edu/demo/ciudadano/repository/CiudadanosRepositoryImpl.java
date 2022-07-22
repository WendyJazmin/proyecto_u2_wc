package com.uce.edu.demo.ciudadano.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.ciudadano.modelo.Ciudadanos;
import com.uce.edu.demo.repository.modelo.Ciudadano;
import com.uce.edu.demo.repository.modelo.Persona;

@Repository
@Transactional
public class CiudadanosRepositoryImpl implements ICiudadanosRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Ciudadanos ciudadano) {
		// TODO Auto-generated method stub
		this.entityManager.persist(ciudadano);
	}

	@Override
	public Ciudadanos buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Ciudadanos.class, id);
	}

	@Override
	public void actualizar(Ciudadanos ciudadano) {
		// TODO Auto-generated method stub
		this.entityManager.merge(ciudadano);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Ciudadanos ciudadano = this.buscar(id);
		this.entityManager.remove(ciudadano);
	}

}
