package com.uce.edu.demo;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.modelo.Estudiante;
import com.uce.edu.demo.estudiante.service.IEstudianteJpaService;
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
	private IEstudianteJpaService iEstudianteJpaService;
	
	private static Logger Logg = Logger.getLogger(ProyectoU2WcApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//criteria API

				Persona per4 = this.iPersonaJpaService.buscarPorCedulaCriteriaApi("1123455");
				Logg.info("Persona CriteriaAPI: "+per4);
				Logg.info("\n");

		//Buscar Dinamicamente
				
				Persona per5 = this.iPersonaJpaService.buscarDinamicamente("Pablo", "Perez", "M");
				Logg.info("Persona Dinamica: "+per5);
				Logg.info("\n");
				
				Persona per6 = this.iPersonaJpaService.buscarDinamicamente("Vale", "Salas", "F");
				Logg.info("Persona Dinamica: "+per6);
				
				Logg.info("\n");
				
		
	}

		
}
