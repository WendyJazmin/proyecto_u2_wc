package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

public interface IPropietarioJpaRepository {

	public void crear(Propietario propietario);
	
	public Propietario consultar(String cedula);
	
	public Propietario buscarPorId(Integer id);
	
	public void actualizar(Propietario propietario);
	
	public void eliminar(String cedula);
	
	public void eliminarPorId(Integer id);
}
