package com.uce.edu.demo.citasmedicas.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.citasmedicas.modelo.CitaMedica;

@Repository
@Transactional
public class CitaMedicaRepository implements ICitaMedicaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		
	}
	
}
