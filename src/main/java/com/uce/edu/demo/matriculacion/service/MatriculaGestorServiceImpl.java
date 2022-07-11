package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Matricula;
import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.repository.IMatriculaJpaRepository;
import com.uce.edu.demo.matriculacion.repository.IPropietarioJpaRepository;
import com.uce.edu.demo.matriculacion.repository.IVehiculoJpaRepository;

@Service
public class MatriculaGestorServiceImpl implements IMatriculaGestorService {

	@Autowired
	private IPropietarioJpaRepository iPropietarioRepository;
	
	@Autowired
	private IVehiculoJpaRepository iVehiculoRepository;
	
	@Autowired
	@Qualifier("pesado")
	private IMatriculaJpaService matriculaServicePesado;
	
	@Autowired
	@Qualifier("liviano")
	private IMatriculaJpaService matriculaServiceLiviano;
	
	@Autowired
	private IMatriculaJpaRepository iMatriculaRepository;

	
	@Override
	public void generarMatricula(String cedula, String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = this.iVehiculoRepository.buscar(placa);
		
		Propietario propietario = this.iPropietarioRepository.consultar(cedula);
	
		String tipo = vehiculo.getTipo();
		BigDecimal valorMatricula;
		
		if(tipo.equals("pesado")) {
			valorMatricula = this.matriculaServicePesado.calcular(vehiculo.getPrecio());
		}else {
			valorMatricula = this.matriculaServiceLiviano.calcular(vehiculo.getPrecio());		
		}
		
		if(valorMatricula.compareTo(new BigDecimal(2000))>0) {
			BigDecimal valorDescuento = valorMatricula.multiply(new BigDecimal(7)).divide(new BigDecimal(100));
			valorMatricula = valorMatricula.subtract(valorDescuento);
		}
	
		Matricula matricula = new Matricula();
		matricula.setFechaMatricula(LocalDateTime.now());
		matricula.setValorMatricula(valorMatricula);
		matricula.setPropietario(propietario);
		matricula.setVehiculo(vehiculo);
		
		this.iMatriculaRepository.crear(matricula);
	}

}
