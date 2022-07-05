package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.modelo.Estudiante;
import com.uce.edu.demo.estudiante.service.IEstudianteJdbcService;
import com.uce.edu.demo.estudiante.service.IEstudianteJpaService;
import com.uce.edu.demo.estudiante.to.EstudianteTo;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.service.IPersonaJpaService;
import com.uce.edu.demo.to.PersonaTo;

@SpringBootApplication
public class ProyectoU2WcApplication implements CommandLineRunner{

	@Autowired
	private IPersonaJdbcService iPersonaJdbcService;
	
	@Autowired
	private IPersonaJpaService iPersonaJpaService;
	
	@Autowired
	private IEstudianteJdbcService iEstudianteJdbcService;
	
	private static Logger Logg = Logger.getLogger(ProyectoU2WcApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//BUSCAR
		//Logg.info("Datos con JPA: "+this.iPersonaJpaService.buscarPorId(4));
		
		//GUARDAR
		Persona per1 = new Persona();
		//per1.setId(8);
		per1.setNombre("Pepito14");
		per1.setApellido("Perez");
		
		this.iPersonaJpaService.guardar(per1);
		
		
		//ACTUALIZAR
		Persona per2 = new Persona();
		per2.setId(4);
		per2.setNombre("AndreA");
		per2.setApellido("Solis");
		//this.iPersonaJpaService.actualizar(per2);
		
		//ELIMINAR
		//this.iPersonaJpaService.eliminar(6);
		
	}

}
