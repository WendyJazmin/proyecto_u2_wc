package com.uce.edu.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.repository.IVehiculoJpaRepository;


@Service
public class VehiculoJpaServiceImpl implements IVehiculoJpaService{

	@Autowired
	private IVehiculoJpaRepository iVehiculoRepository;

	@Override
	public void insertarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.insertar(vehiculo);
	}

	@Override
	public Vehiculo buscarVehiculo(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.buscar(placa);
	}

	@Override
	public void actualizarVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.actualizar(v);
	}

	@Override
	public void eliminarVehiculo(String placa) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.eliminar(placa);
	}

	@Override
	public Vehiculo buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.buscarPorId(id);
	}
	

}
