package com.uce.edu.demo.ciudadano.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.ciudadano.modelo.Ciudadanos;
import com.uce.edu.demo.ciudadano.repository.ICiudadanosRepository;
import com.uce.edu.demo.repository.ICiudadanoRepository;
import com.uce.edu.demo.repository.IPersonaJpaRepository;
import com.uce.edu.demo.repository.modelo.Ciudadano;

@Service
public class CiudadanosServiceImpl implements ICiudadanosService {

	
	@Autowired
	private ICiudadanosRepository iCiudadanoRepository;
	
	@Override
	public void insertar(Ciudadanos ciudadano) {
		// TODO Auto-generated method stub
		this.iCiudadanoRepository.insertar(ciudadano);
	}

	@Override
	public Ciudadanos buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepository.buscar(id);
	}

	@Override
	public void actualizar(Ciudadanos ciudadano) {
		// TODO Auto-generated method stub
		this.iCiudadanoRepository.actualizar(ciudadano);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iCiudadanoRepository.eliminar(id);
	}

}
