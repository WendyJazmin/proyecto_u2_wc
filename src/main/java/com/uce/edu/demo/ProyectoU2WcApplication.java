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
import com.uce.edu.demo.estudiante.modelo.EstudianteContadorEdad;
import com.uce.edu.demo.estudiante.modelo.EstudianteSencillo;
import com.uce.edu.demo.estudiante.service.IEstudianteJpaService;

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.service.IPersonaJpaService;

import  com.uce.edu.demo.repository.modelo.PersonaSencilla;



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
		
		
		//buscando estudiantes menores de 21 anios
		List<EstudianteSencillo> listaEstudiante =this.iEstudianteJpaService.buscarPorNombreEdadSencillo(21);
		
		for(EstudianteSencillo item:listaEstudiante) {
			Logg.info(item);
		}
		
		Logg.info("\n");
		
		
		//agrupando a los estudiantes por edad, donde sus apellidos inician con S
		List<EstudianteContadorEdad> listaCant = this.iEstudianteJpaService.consultarCantidadPorEdad();
		
		for(EstudianteContadorEdad item:listaCant) {
			Logg.info(item);
		}
		
		Logg.info("\n");
		
		
	}

		
}
