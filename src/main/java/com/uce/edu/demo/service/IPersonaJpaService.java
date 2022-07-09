package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.to.PersonaTo;

public interface IPersonaJpaService {
	
	public List<Persona> buscarPorNombre(String nombre);
	
	public List<Persona> buscarPorGenero(String genero);
	
	public List<Persona> buscarPorApellido(String apellido);
	
	public Persona buscarPorCedula(String cedula);

	public Persona buscarPorId(Integer id);
	public void guardar(Persona persona);
	public void actualizar(Persona persona);
	public void eliminar(Integer id);
	
	public int actualizarPorApellido(String genero,String apellido);
	
	public int eliminarPorGenero(String genero);
	
}