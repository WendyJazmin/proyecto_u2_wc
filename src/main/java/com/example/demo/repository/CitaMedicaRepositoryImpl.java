package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CitaMedica;


@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}

	@Override
	public CitaMedica buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<CitaMedica> myQuery = this.entityManager.createQuery("select c from CitaMedica c where c.numero =:datoNumero",CitaMedica.class);
		myQuery.setParameter("datoNumero", numero);
		return myQuery.getSingleResult();
	}
	
	
	
}
