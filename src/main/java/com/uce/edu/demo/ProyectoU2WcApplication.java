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
	
	@Autowired
	private IEstudianteJpaService iEstudianteJpaService;
	
	private static Logger Logg = Logger.getLogger(ProyectoU2WcApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		//INSERTAR
		Estudiante estudiante = new Estudiante();
		estudiante.setId(6);
		estudiante.setNombre("Dominik");
		estudiante.setApellido("Velez");
		estudiante.setEdad(18);
		estudiante.setNumeroTelefono("0989678055");
		
		this.iEstudianteJpaService.guardar(estudiante);

		
		//BUSCAR
		Logg.info(this.iEstudianteJpaService.buscarPorId(1));
				
				
		//ACTUALIZAR
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setId(2);
		estudiante2.setNombre("Jeff");
		estudiante2.setApellido("Satur");
		estudiante2.setEdad(27);
		estudiante2.setNumeroTelefono("089421156");
		
		this.iEstudianteJpaService.actualizar(estudiante2);
		
		
		//ELIMINAR
		this.iEstudianteJpaService.eliminar(4);
		
	}

}
