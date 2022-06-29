package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.service.IEstudianteJdbcService;
import com.uce.edu.demo.estudiante.to.Estudiante;
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
		
		
		//Logg.info(this.iPersonaJdbcService.buscarTodos());
		Logg.info("Datos con JPA: "+this.iPersonaJpaService.buscarPorId(10));
		
		Persona per1 = new Persona();
		per1.setId(1);
		per1.setNombre("Edison");
		per1.setApellido("Cayambe");
		
		//GUARDAR
		//this.iPersonaJpaService.guardar(per1);
		
		//ACTUALIZAR
		Persona per2 = new Persona();
		per2.setId(2);
		per2.setNombre("Ana");
		per2.setApellido("Camir");
		this.iPersonaJpaService.actualizar(per2);
		
		//ELIMINAR}
		//this.iPersonaJpaService.eliminar(6);
		
	}

}
