package com.uce.edu.demo;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	
	private static Logger Logg = Logger.getLogger(ProyectoU2WcApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Persona persona = new Persona();
		persona.setNombre("Daniel");
		persona.setApellido("Velez");
		persona.setCedula("23123455");
		persona.setGenero("M");
		this.iPersonaJpaService.guardar(persona);
		
		//1 TypedQuery
		Persona perTyped = this.iPersonaJpaService.buscarPorCedulaTyped("1123455");
		Logg.info("Persona Typed: "+perTyped);
		
		//2 NamedQuery
		Persona perNamed = this.iPersonaJpaService.buscarPorCedulaNamed("1123455");
		Logg.info("Persona Named: "+perNamed);
		
		//3 TypedQuery
		Persona perTypeNamed = this.iPersonaJpaService.buscarPorCedulaTypedNamed("1123455");
		Logg.info("Persona TypedNamed: "+perTypeNamed);
		
		//4. Varios NamedQuery
		List<Persona>listaPersona= this.iPersonaJpaService.buscarPorNombreApellido("Daniel", "Velez");
		for(Persona item:listaPersona) {
			Logg.info(listaPersona);
		}
	
	}

}
