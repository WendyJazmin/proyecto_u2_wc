package com.uce.edu.demo.estudiante.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.estudiante.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;

@Repository
@Transactional
public class EstudianteJpaRepositoryImpl implements IEstudianteJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Estudiante buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Estudiante estudiante = this.buscarPorId(id);
		this.entityManager.remove(estudiante);
	}

	@Override
	public Estudiante buscarPorTelefonoTyped(String telefono) {
		TypedQuery<Estudiante> miTypedQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.numeroTelefono = :datoTelefono",Estudiante.class); 
		miTypedQuery.setParameter("datoTelefono", telefono);
		return miTypedQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorEdadTyped(Integer edad) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> miTypedQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.edad > :datoEdad",Estudiante.class); 
		miTypedQuery.setParameter("datoEdad", edad);
		return miTypedQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorEdadNamed(Integer edad) {
		// TODO Auto-generated method stub
		Query myQuery =this.entityManager.createNamedQuery("Estudiante.buscarPorEdad");
		myQuery.setParameter("datoEdad",edad);
		return (List<Estudiante>) myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreNamed(String nombre) {
		Query myQuery =this.entityManager.createNamedQuery("Estudiante.buscarPorNombre");
		myQuery.setParameter("datoNombre",nombre);
		return (List<Estudiante>) myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorApellidoTypedNamed(String apellido) {
		TypedQuery<Estudiante> miTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellido",Estudiante.class); 
		miTypedQuery.setParameter("datoApellido", apellido);
		return miTypedQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> miTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombre",Estudiante.class); 
		miTypedQuery.setParameter("datoNombre", nombre);
		return miTypedQuery.getResultList();
	}

	

}
