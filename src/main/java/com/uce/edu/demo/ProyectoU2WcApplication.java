package com.uce.edu.demo;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.ciudadano.modelo.Ciudadanos;
import com.uce.edu.demo.ciudadano.modelo.Pasaporte;
import com.uce.edu.demo.estudiante.modelo.Estudiante;
import com.uce.edu.demo.estudiante.modelo.EstudianteContadorEdad;
import com.uce.edu.demo.estudiante.modelo.EstudianteSencillo;
import com.uce.edu.demo.estudiante.service.IEstudianteJpaService;
import com.uce.edu.demo.repository.modelo.Ciudadano;
import com.uce.edu.demo.repository.modelo.Empleado;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.service.IPersonaJpaService;
import com.uce.edu.demo.service.ICiudadanoService;
import com.uce.edu.demo.ciudadano.service.ICiudadanosService;
import  com.uce.edu.demo.repository.modelo.PersonaSencilla;



@SpringBootApplication
public class ProyectoU2WcApplication implements CommandLineRunner{


	@Autowired
	private IPersonaJpaService iPersonaJpaService;
	
	@Autowired
	private IEstudianteJpaService iEstudianteJpaService;
	
	@Autowired
	private ICiudadanoService ICiudadanoService;
	
	@Autowired
	private ICiudadanosService ICiudadanosService;
	
	private static Logger Logg = Logger.getLogger(ProyectoU2WcApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//INSERTAR
		Ciudadanos ciu1 = new Ciudadanos();
		ciu1.setNombre("Jessie");
		ciu1.setApellido("Satur");
		ciu1.setCedula("1556473236");
		ciu1.setFechaNacimiento(LocalDateTime.now());
		
		Pasaporte pasaporte = new Pasaporte();
		pasaporte.setFechaCaducidad(LocalDateTime.of(2030, 1, 20, 12, 20));
		pasaporte.setFechaEmision(LocalDateTime.now());
		pasaporte.setNumero("3322944557");
		pasaporte.setCiudadano(ciu1);
		
		ciu1.setPasaporte(pasaporte);
		
		this.ICiudadanosService.insertar(ciu1);
		
		
		
		Logg.info("\n");
		
		//BUSCAR
		Ciudadanos ciudadano = this.ICiudadanosService.buscar(4);
		Logg.info(ciudadano+"\n");
		
		//ACTUALIZAR
		Ciudadanos ciudadano2 = new Ciudadanos();
		ciudadano2.setId(8);
		ciudadano2.setApellido("Perez");
		ciudadano2.setCedula("11213447");
		ciudadano2.setFechaNacimiento(LocalDateTime.of(2022,7,22,9,19,19));
		ciudadano2.setNombre("Daniela");
		this.ICiudadanosService.actualizar(ciudadano2);
		Logg.info("\n");
		
		
		//ELIMINAR
		this.ICiudadanosService.eliminar(9);
		
		Logg.info("\n");
		
	}

		
}
