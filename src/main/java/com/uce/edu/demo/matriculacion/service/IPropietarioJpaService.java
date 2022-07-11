package com.uce.edu.demo.matriculacion.service;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

public interface IPropietarioJpaService {

	
	void crearPropietario(Propietario propietario);
	
	public Propietario consultar(String cedula);
	
	public Propietario buscarPorId(Integer id);
	
	public void actualizar(Propietario propietario);
	
	public void eliminarPropietario(String cedula);
	
	public void eliminarPorId(Integer id);
}
