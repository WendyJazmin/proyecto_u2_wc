package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoJpaRepository {
	
	public void insertar(Vehiculo vehiculo);

	public Vehiculo buscar(String placa);
	
	public Vehiculo buscarPorId(Integer id);
	
	public void actualizar(Vehiculo v);
	
	public void eliminar(String placa);
	
}
