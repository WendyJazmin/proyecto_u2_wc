package com.uce.edu.demo.estudiante.repository;


import java.util.List;

import com.uce.edu.demo.estudiante.modelo.Estudiante;

public interface IEstudianteJpaRepository {

	public Estudiante buscarPorId(Integer id);
	
	public Estudiante buscarPorTelefonoTyped(String telefono);
	
	public List<Estudiante> buscarPorEdadTyped(Integer edad);
	
	public List<Estudiante> buscarPorEdadNamed(Integer edad);
	
	public List<Estudiante> buscarPorNombreNamed(String nombre);
	
	public List<Estudiante> buscarPorApellidoTypedNamed(String apellido);
	
	public List<Estudiante> buscarPorNombreTypedNamed(String nombre);
	
	public void insertar(Estudiante estudiante);
	
	public void actualizar(Estudiante estudiante);
	
	public void eliminar(Integer id);
	
	
}
