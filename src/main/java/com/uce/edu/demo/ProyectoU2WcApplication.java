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


		
		//Criteria API
		Estudiante estu1 = this.iEstudianteJpaService.buscarPorNumTelefonoCriteriaApi("0120483402941");
		Logg.info("Estudiante CriteriaAPI: "+estu1);
		
		Logg.info("\n");
		
		//buscar dinamicamente
		List <Estudiante> listaEstu= this.iEstudianteJpaService.buscarDinamicamente(19, 21);//estudiantes de 19 o 21 anios

		for(Estudiante item:listaEstu) {
			Logg.info("Estudiante Dinamica: "+item);
		}
		
	}

		
}
