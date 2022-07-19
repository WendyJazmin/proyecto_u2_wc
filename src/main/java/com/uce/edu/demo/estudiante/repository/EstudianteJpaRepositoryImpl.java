package com.uce.edu.demo.estudiante.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.estudiante.modelo.Estudiante;
import com.uce.edu.demo.estudiante.modelo.EstudianteContadorEdad;
import com.uce.edu.demo.estudiante.modelo.EstudianteSencillo;
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

	//objeto sencillo
	@Override
	public List<EstudianteSencillo> buscarPorNombreEdadSencillo(Integer edad) {
		// TODO Auto-generated method stub
		TypedQuery<EstudianteSencillo> myQuery =this.entityManager.createQuery("SELECT NEW com.uce.edu.demo.estudiante.modelo.EstudianteSencillo(e.nombre,e.edad) FROM Estudiante e WHERE e.edad < :datoEdad",EstudianteSencillo.class);
	
		myQuery.setParameter("datoEdad", edad);
		return myQuery.getResultList();
	}
	
	//objeto sencillo
	@Override
	public List<EstudianteContadorEdad> consultarCantidadPorEdad() {
		// TODO Auto-generated method stub
		TypedQuery<EstudianteContadorEdad> myQuery =this.entityManager.createQuery("SELECT NEW com.uce.edu.demo.estudiante.modelo.EstudianteContadorEdad(e.edad,COUNT(e.edad)) FROM Estudiante e WHERE e.apellido like 'S%' group by e.edad",EstudianteContadorEdad.class);
		
		return myQuery.getResultList();
	}

	
	@Override
	public List<Estudiante> buscarPorNombreNative(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery =this.entityManager.createNativeQuery("SELECT * FROM estudiante  WHERE estu_nombre = :datoNombre ORDER BY estu_edad",Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return (List<Estudiante>)myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorEdadNative(Integer edad) {
		// TODO Auto-generated method stub
		Query myQuery =this.entityManager.createNativeQuery("SELECT * FROM estudiante  WHERE estu_edad = :datoEdad ORDER BY estu_apellido",Estudiante.class);
		myQuery.setParameter("datoEdad", edad);
		return (List<Estudiante>)myQuery.getResultList();
	}

	@Override
	public Estudiante buscarPorNumTelefonoNamedNative(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery =this.entityManager.createNamedQuery("Estudiante.buscarPorNumTelefonoNative",Estudiante.class);
		myQuery.setParameter("datoTelefono", numero);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarIdApellidoNamedNative(Integer id, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery =this.entityManager.createNamedQuery("Estudiante.buscarPorIDApellidoNative",Estudiante.class);
		myQuery.setParameter("datoId", id);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNumTelefonoCriteriaApi(String numero) {
		// TODO Auto-generated method stub
		//Creamos una instancia de la interfsaz CriteriaBuilder Fabrica para construir eñ SQL
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		
		//Especificamos el retorno de mi SQL
		CriteriaQuery<Estudiante> myQuery = myBuilder.createQuery(Estudiante.class);
		
		//Aqui se empieza a construir el SQL
		//Root FROM
		Root<Estudiante> estudianteFrom = myQuery.from(Estudiante.class);
		
		//las condiciones where en criteria API se los conoce como predicados
		Predicate p1 = myBuilder.equal(estudianteFrom.get("numeroTelefono"), numero);//e.numeroTelefono = :datoTelefono
				
		CriteriaQuery<Estudiante> myQueryCompleto = myQuery.select(estudianteFrom).where(p1);
		//Finalizado mi Query Completo
		
		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myQueryCompleto);
		return myQueryFinal.getSingleResult();

	}

	@Override
	public List<Estudiante> buscarDinamicamente(Integer edad1,Integer edad2) {
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();
		
		CriteriaQuery<Estudiante> myQuery = myCriteria.createQuery(Estudiante.class);
		
		Root<Estudiante> myTabla =myQuery.from(Estudiante.class);
		

		Predicate predicadoEdad1 = myCriteria.equal(myTabla.get("edad"), edad1);
		Predicate predicadoEdad2 = myCriteria.equal(myTabla.get("edad"), edad2);;
		
		Predicate miPredicadoFinal = myCriteria.or(predicadoEdad1,predicadoEdad2);
		
		myQuery.select(myTabla).where(miPredicadoFinal);
		
		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myQuery);
		return (List<Estudiante>)myQueryFinal.getResultList();
		
	}

	

	

}
