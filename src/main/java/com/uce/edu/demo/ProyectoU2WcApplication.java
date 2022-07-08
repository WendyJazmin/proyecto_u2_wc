package com.uce.edu.demo;


import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IPersonaJpaService;




@SpringBootApplication
public class ProyectoU2WcApplication implements CommandLineRunner{


	@Autowired
	private IPersonaJpaService iPersonaJpaService;
	
	
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
		per1.setNombre("Dana");
		per1.setApellido("Velez");
		per1.setGenero("F");
		per1.setCedula("13343590");
		
		this.iPersonaJpaService.guardar(per1);
		
		
		//ACTUALIZAR
		Persona per2 = new Persona();
		per2.setId(4);
		per2.setNombre("AndreA");
		per2.setApellido("Solis");
		//this.iPersonaJpaService.actualizar(per2);
		
		//ELIMINAR
		//this.iPersonaJpaService.eliminar(6);
		
		
		//BUSCAR POR CEDULA
		Persona p = this.iPersonaJpaService.buscarPorCedula("2394864");
		Logg.info("Buscar persona: "+p);
	
		//BUSCAR POR APELLIDO
		List<Persona> listaPersona = this.iPersonaJpaService.buscarPorApellido("Perez");
		for(Persona item : listaPersona) {
			Logg.info("Persona: "+item);
		}
		
		//BUSCAR POR NOMBRE
		List<Persona> listaNombres = this.iPersonaJpaService.buscarPorNombre("Pepito14");
		for(Persona item : listaNombres) {
			Logg.info("Persona: "+item);
		}
		
		
		//BUSCAR POR GENERO
		List<Persona> listaGenero = this.iPersonaJpaService.buscarPorGenero("F");
		for(Persona item : listaGenero) {
			Logg.info("Persona: "+item);
		}
		
	}

}
