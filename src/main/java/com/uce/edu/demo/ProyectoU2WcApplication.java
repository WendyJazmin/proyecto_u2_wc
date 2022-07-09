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
		
		//Actualizar con JPQL
		int resultado =this.iPersonaJpaService.actualizarPorApellido("FE", "Perez");
		Logg.info("Cantidad de registros Actualizados: "+resultado);
		
		int resultado2 = this.iPersonaJpaService.eliminarPorGenero("FE");
		Logg.info("Cantidad de eliminados: "+resultado2);
	}

}
