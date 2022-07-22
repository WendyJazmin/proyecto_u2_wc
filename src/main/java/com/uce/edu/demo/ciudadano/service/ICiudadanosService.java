package com.uce.edu.demo.ciudadano.service;

import com.uce.edu.demo.ciudadano.modelo.Ciudadanos;
import com.uce.edu.demo.repository.modelo.Ciudadano;

public interface ICiudadanosService {

	public void insertar(Ciudadanos ciudadano);
	
	public Ciudadanos buscar(Integer id);
	
	public void actualizar(Ciudadanos ciudadano);
	
	public void eliminar(Integer id);

}
