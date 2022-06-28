package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.to.Persona;

@SpringBootApplication
public class ProyectoU2WcApplication implements CommandLineRunner{

	//@Autowired
	private IPersonaJdbcService iPersonaJdbcService;
	
	private static Logger LogJava = Logger.getLogger(ProyectoU2WcApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hola mundo");
		
		Persona persona = new Persona();
		persona.setId(4);
		persona.setNombre("Daniel");
		persona.setApellido("Satur");
		System.out.println(persona.getApellido());;
		
		//Insertar
		this.iPersonaJdbcService.guardar(persona);
		
		Persona per1 = new Persona();
		per1.setId(1);
		per1.setNombre("Andres");
		per1.setApellido("Fare");
		
		//actualizar
		//this.iPersonaJdbcService.actualizar(per1);
		//this.iPersonaJdbcService.eliminar(2);
	}

}
