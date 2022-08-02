package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.repository.modelo.PacienteSencillo;



@Repository
@Transactional
public class PacienteRepositoryImpl implements IPacienteRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Paciente> myQuery =this.entityManager.createQuery("select p from Paciente p where p.cedula = :datoCedula",Paciente.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public List<PacienteSencillo> buscarPacienteSencillo(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		TypedQuery<PacienteSencillo> myQuery =this.entityManager.createQuery(
				"select NEW com.example.demo.repository.modelo.PacienteSencillo(p.cedula, p.nombre, p.fechaNacimiento, p.genero)from Paciente p where p.fechaNacimiento > :fecha and p.genero = :genero",PacienteSencillo.class);
		myQuery.setParameter("fecha", fecha);
		myQuery.setParameter("genero", genero);
		return myQuery.getResultList();

	}

	
}
