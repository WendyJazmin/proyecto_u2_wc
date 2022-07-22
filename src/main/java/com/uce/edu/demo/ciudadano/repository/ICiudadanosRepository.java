package com.uce.edu.demo.ciudadano.repository;

import com.uce.edu.demo.ciudadano.modelo.Ciudadanos;


public interface ICiudadanosRepository {

	public void insertar(Ciudadanos ciudadano);
	
	public Ciudadanos buscar(Integer id);
	
	public void actualizar(Ciudadanos ciudadano);
	
	public void eliminar(Integer id);
}
