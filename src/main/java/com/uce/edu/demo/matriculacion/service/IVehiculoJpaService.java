package com.uce.edu.demo.matriculacion.service;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoJpaService {

	public Vehiculo buscarPorId(Integer id);
	public void insertarVehiculo(Vehiculo vehiculo);

	public Vehiculo buscarVehiculo(String placa);
	
	public void actualizarVehiculo(Vehiculo v);
	
	public void eliminarVehiculo(String placa);
	
}
