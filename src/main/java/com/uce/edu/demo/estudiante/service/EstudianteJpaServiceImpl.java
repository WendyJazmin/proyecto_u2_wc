package com.uce.edu.demo.estudiante.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.estudiante.modelo.Estudiante;
import com.uce.edu.demo.estudiante.modelo.EstudianteContadorEdad;
import com.uce.edu.demo.estudiante.modelo.EstudianteSencillo;
import com.uce.edu.demo.estudiante.repository.IEstudianteJpaRepository;
import com.uce.edu.demo.repository.modelo.Persona;

@Service
public class EstudianteJpaServiceImpl implements IEstudianteJpaService {

	@Autowired
	private IEstudianteJpaRepository iEstudianteRepository;
	
	@Override
	public Estudiante buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.buscarPorId(id);
	}

	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteRepository.insertar(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteRepository.actualizar(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iEstudianteRepository.eliminar(id);
	}

	@Override
	public Estudiante buscarPorTelefonoTyped(String telefono) {
		
		return this.iEstudianteRepository.buscarPorTelefonoTyped(telefono);
	}
	
	
	@Override
	public Estudiante buscarPorNumTelefonoCriteriaApi(String numero) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.buscarPorNumTelefonoCriteriaApi(numero);
	}


	@Override
	public List<Estudiante> buscarPorEdadTyped(Integer edad) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.buscarPorEdadTyped(edad);
	}

	@Override
	public List<Estudiante> buscarPorEdadNamed(Integer edad) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.buscarPorEdadNamed(edad);
	}

	@Override
	public List<Estudiante> buscarPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.buscarPorNombreNamed(nombre);

	}

	@Override
	public List<Estudiante> buscarPorApellidoTypedNamed(String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.buscarPorApellidoTypedNamed(apellido);
	}

	@Override
	public List<Estudiante> buscarPorNombreTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.buscarPorNombreTypedNamed(nombre);
	}

	@Override
	public List<Estudiante> buscarPorNombreNative(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.buscarPorNombreNative(nombre);
	}

	@Override
	public List<Estudiante> buscarPorEdadNative(Integer edad) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.buscarPorEdadNative(edad);
	}

	@Override
	public Estudiante buscarPorNumTelefonoNamedNative(String numero) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.buscarPorNumTelefonoNamedNative(numero);
	}

	@Override
	public Estudiante buscarIdApellidoNamedNative(Integer id, String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.buscarIdApellidoNamedNative(id, apellido);
	}

	@Override
	public List<Estudiante> buscarDinamicamente(Integer edad1, Integer edad2) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.buscarDinamicamente(edad1, edad2);
	}

	
	@Override
	public List<EstudianteSencillo> buscarPorNombreEdadSencillo(Integer edad) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.buscarPorNombreEdadSencillo(edad);
	}

	@Override
	public List<EstudianteContadorEdad> consultarCantidadPorEdad() {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.consultarCantidadPorEdad();
	}


}
