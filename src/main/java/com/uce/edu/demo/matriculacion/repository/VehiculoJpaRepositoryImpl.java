package com.uce.edu.demo.matriculacion.repository;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.repository.modelo.Persona;

@Repository
@Transactional
public class VehiculoJpaRepositoryImpl implements IVehiculoJpaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("SELECT v FROM Vehiculo v WHERE v.placa = :datoPlaca");
		jpqlQuery.setParameter("datoPlaca", placa);
		return (Vehiculo)jpqlQuery.getSingleResult();
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.entityManager.merge(v);

	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = this.buscar(placa);
		this.entityManager.remove(vehiculo);
	}

}
