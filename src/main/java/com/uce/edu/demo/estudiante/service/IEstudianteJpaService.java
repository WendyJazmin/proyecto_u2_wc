package com.uce.edu.demo.estudiante.service;

import java.util.List;

import com.uce.edu.demo.estudiante.modelo.Estudiante;
import com.uce.edu.demo.estudiante.modelo.EstudianteContadorEdad;
import com.uce.edu.demo.estudiante.modelo.EstudianteSencillo;

public interface IEstudianteJpaService {

	public Estudiante buscarPorId(Integer id);
	
	public Estudiante buscarPorTelefonoTyped(String telefono);
	
	public List<Estudiante> buscarPorEdadTyped(Integer edad);
	
	public List<Estudiante> buscarDinamicamente(Integer edad1,Integer edad2);

	
	public List<EstudianteSencillo> buscarPorNombreEdadSencillo(Integer edad);

	public List<EstudianteContadorEdad> consultarCantidadPorEdad();
	
	
	public List<Estudiante> buscarPorEdadNamed(Integer edad);
	
	
	public List<Estudiante> buscarPorNombreNative(String nombre);
	
	public List<Estudiante> buscarPorEdadNative(Integer edad);
	
	public Estudiante buscarPorNumTelefonoNamedNative(String numero);
	
	public Estudiante buscarPorNumTelefonoCriteriaApi(String numero);

	
	public Estudiante buscarIdApellidoNamedNative(Integer id,String apellido);
	

	public List<Estudiante> buscarPorNombreNamed(String nombre);
	
	public List<Estudiante> buscarPorApellidoTypedNamed(String apellido);

	public List<Estudiante> buscarPorNombreTypedNamed(String nombre);

	
	public void guardar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void eliminar(Integer id);
	
}
