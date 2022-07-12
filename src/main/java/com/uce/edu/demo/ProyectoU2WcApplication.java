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
		
		Estudiante e = new Estudiante();
		e.setApellido("Rodriguez");
		e.setNombre("Carla");
		e.setEdad(24);
		e.setNumeroTelefono("01202941");
		//this.iEstudianteJpaService.guardar(e);
		
		
		//TyperQuery
		Estudiante e2 = this.iEstudianteJpaService.buscarPorTelefonoTyped("0283883321");//buscando estudiando por su n° telefono
		Logg.info("Estudiante Typed: "+e2);
		
		List<Estudiante>listae= this.iEstudianteJpaService.buscarPorEdadTyped(18);//buscando estudiantes mayores de 18
		for(Estudiante item:listae) {
			Logg.info("Estudiante EdadTyped: "+item);
		}
		
		
		//NamedQuery
		List<Estudiante>listae2= this.iEstudianteJpaService.buscarPorEdadNamed(24);
		for(Estudiante item:listae2) {
			Logg.info("Estudiante EdadNamed: "+item);
			
		}
		
		List<Estudiante>listae3= this.iEstudianteJpaService.buscarPorNombreNamed("Carla");
		for(Estudiante item:listae3) {
			Logg.info("Estudiante NombreNamed: "+item);
			
		}
		
		
		//Combinacion Typed y Named Query
		List<Estudiante>listae4= this.iEstudianteJpaService.buscarPorApellidoTypedNamed("Chavez");
		for(Estudiante item:listae4) {
			Logg.info("Estudiante ApellidoTypedNamedNamed: "+item);
			
		}
	
		List<Estudiante>listae5= this.iEstudianteJpaService.buscarPorNombreTypedNamed("Carla");
		for(Estudiante item:listae5) {
			Logg.info("Estudiante NombreTypeNamed: "+item);
	}
	}

}
