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
		
		
		//Native Query
		List<Estudiante> listaEstu = this.iEstudianteJpaService.buscarPorNombreNative("Marco");
		for(Estudiante item:listaEstu) {
			Logg.info("Estudiante nombreNative: "+item);
		}
		Logg.info("\n");
		
		List<Estudiante> listaEstu2 = this.iEstudianteJpaService.buscarPorEdadNative(18);
		for(Estudiante item:listaEstu2) {
			Logg.info("Estudiante edadNative: "+item);
		}
		Logg.info("\n");
		
		//Named Native Query
		Estudiante estu2 = this.iEstudianteJpaService.buscarPorNumTelefonoNamedNative("09321663321");
		Logg.info("Telefono NamedNative: "+estu2+"\n");
		
		Estudiante estu3 = this.iEstudianteJpaService.buscarIdApellidoNamedNative(3, "Diaz");
		Logg.info("id y apellido NamedNative: "+estu3);
		
		Logg.info("\n");
	}

		
}
