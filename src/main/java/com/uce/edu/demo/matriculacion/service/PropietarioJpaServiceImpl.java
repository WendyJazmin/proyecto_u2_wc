package com.uce.edu.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.repository.IPropietarioJpaRepository;

@Service
public class PropietarioJpaServiceImpl implements IPropietarioJpaService {

	@Autowired
	private IPropietarioJpaRepository iPropietarioRepository;
	
	@Override
	public void crearPropietario(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.crear(propietario);
	}

	@Override
	public void eliminarPropietario(String cedula) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.eliminar(cedula);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.eliminarPorId(id);
	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.consultar(cedula);
	}

	@Override
	public Propietario buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.buscarPorId(id);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.actualizar(propietario);
	}

}
