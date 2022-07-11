package com.uce.edu.demo.matriculacion.repository;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;


@Repository
@Transactional
public class PropietarioJpaRepositoryImpl implements IPropietarioJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(propietario);
	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Propietario p WHERE p.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		return (Propietario)jpqlQuery.getSingleResult();
	}

	@Override
	public Propietario buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Propietario.class, id);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Propietario p = this.consultar(cedula);
		this.entityManager.remove(p);
		
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		Propietario propietario = this.buscarPorId(id);
		this.entityManager.remove(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(propietario);
	}

	
}
