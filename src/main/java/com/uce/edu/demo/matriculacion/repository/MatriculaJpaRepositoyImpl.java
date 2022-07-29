package com.uce.edu.demo.matriculacion.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Matricula;

@Repository
@Transactional
public class MatriculaJpaRepositoyImpl implements IMatriculaJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);;
	}

	@Override
	public Matricula buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Matricula.class, id);
	}

}
