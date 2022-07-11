package com.uce.edu.demo;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.service.IMatriculaGestorService;
import com.uce.edu.demo.matriculacion.service.IPropietarioJpaService;
import com.uce.edu.demo.matriculacion.service.IVehiculoJpaService;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IPersonaJpaService;




@SpringBootApplication
public class ProyectoU2WcApplication implements CommandLineRunner{


	@Autowired
	private IPersonaJpaService iPersonaJpaService;
	
	@Autowired
	private IVehiculoJpaService iVehiculoService;
	
	@Autowired
	private IPropietarioJpaService iPropietarioJpaService;
	
	@Autowired
	private IMatriculaGestorService gestorService;
	
	
	private static Logger Logg = Logger.getLogger(ProyectoU2WcApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		//INSERTAR vehiculo
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Wolkswagen");
		vehiculo.setPlaca("227re");
		vehiculo.setPrecio(new BigDecimal(77000));
		vehiculo.setTipo("pesado");
		
		Vehiculo vehiculo2 = new Vehiculo();
		vehiculo2.setMarca("Mercedes Benz");
		vehiculo2.setPlaca("346op");
		vehiculo2.setPrecio(new BigDecimal(140000));
		vehiculo2.setTipo("liviano");
		
		this.iVehiculoService.insertarVehiculo(vehiculo);
		this.iVehiculoService.insertarVehiculo(vehiculo2);
		
		//BUSCAR VEHICULO por placa
		Vehiculo vehiculo3 = this.iVehiculoService.buscarVehiculo("321sd");
		Logg.info("Buscar vehiculo: "+vehiculo3);
		
		
		//ACTUALIZAR VEHICULO
		Vehiculo vehiculo4 = new Vehiculo();
		vehiculo4.setMarca("Chevrolet");
		vehiculo4.setPlaca("245gh");
		vehiculo4.setPrecio(new BigDecimal(90000));
		vehiculo4.setTipo("pesado");
		
		this.iVehiculoService.actualizarVehiculo(vehiculo4);
		
		
		//ELIMINAR VEHICULO por placa
		this.iVehiculoService.eliminarVehiculo("324fd");
		
		
		//************************************************************
		
		//INSERTAR PROPIETARIO
		Propietario propietario = new Propietario();
		propietario.setNombre("Pamela");
		propietario.setApellido("Romo");
		propietario.setCedula("1324567");
		propietario.setFechaNacimiento(LocalDateTime.of(2000, 8, 16, 9, 30));
		
		this.iPropietarioJpaService.crearPropietario(propietario);
		
		
		//BUSCAR PROPIETARIO por cedula
		Propietario propietario2 = this.iPropietarioJpaService.consultar("1234456");
		Logg.info("Buscar propietario por id: "+propietario2);
		
		
		//ELIMINAR PROPIETARIO por cedula
		//this.iPropietarioJpaService.eliminarPorId(12);
		this.iPropietarioJpaService.eliminarPropietario("2324");
		
		
		//ACTUALIZAR PROPIETARIO
		Propietario propietario3 = new Propietario();
		propietario.setId(8);
		propietario3.setNombre("Jenny");
		propietario3.setApellido("Rivas");
		propietario3.setCedula("113344355");
		propietario3.setFechaNacimiento(LocalDateTime.of(2000, 9, 16, 9, 30));
		
		this.iPropietarioJpaService.actualizar(propietario3);
		
		//*******************************************************************
		
		//INSERTAR MATRICULA
		this.gestorService.generarMatricula("2135156", "23445f");
	}

}
