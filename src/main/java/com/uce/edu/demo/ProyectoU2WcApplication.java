package com.uce.edu.demo;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.ciudadano.modelo.Ciudadanos;
import com.uce.edu.demo.ciudadano.modelo.Pasaporte;
import com.uce.edu.demo.estudiante.modelo.Estudiante;
import com.uce.edu.demo.estudiante.modelo.EstudianteContadorEdad;
import com.uce.edu.demo.estudiante.modelo.EstudianteSencillo;
import com.uce.edu.demo.estudiante.service.IEstudianteJpaService;
import com.uce.edu.demo.repository.modelo.Ciudadano;
import com.uce.edu.demo.repository.modelo.Empleado;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.service.IPersonaJpaService;
import com.uce.edu.demo.service.ICiudadanoService;
import com.uce.edu.demo.service.IHabitacionService;
import com.uce.edu.demo.service.IHotelService;
import com.uce.edu.demo.ciudadano.service.ICiudadanosService;
import com.uce.edu.demo.escritor.modelo.Autor;
import com.uce.edu.demo.escritor.modelo.Libro;
import com.uce.edu.demo.escritor.service.IAutorService;
import com.uce.edu.demo.escritor.service.ILibroService;
import  com.uce.edu.demo.repository.modelo.PersonaSencilla;
import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;



@SpringBootApplication
public class ProyectoU2WcApplication implements CommandLineRunner{

	@Autowired
	private IAutorService iAutorService;
	
	@Autowired
	private ILibroService iLibroService;

	@Autowired
	private IPersonaJpaService iPersonaJpaService;
	
	@Autowired
	private IEstudianteJpaService iEstudianteJpaService;
	
	@Autowired
	private ICiudadanoService ICiudadanoService;
	
	@Autowired
	private ICiudadanosService ICiudadanosService;
	
	@Autowired
	private IHotelService ihotelervice;
	
	@Autowired
	private IHabitacionService ihabitacionervice;
	
	private static Logger Logg = Logger.getLogger(ProyectoU2WcApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		//INSERTAR AUTOR
		Autor autor1 = new Autor();
		autor1.setNombre("Marlon");
		autor1.setApellido("Velez");
		autor1.setEdad("45");
		autor1.setGenero("M");
		autor1.setPaisOrigen("Mexico");
		this.iAutorService.insertar(autor1);
		Logg.info("\n");
		
		
		//Insertar libro
		Autor autor = new Autor();
		autor.setId(1);
		
		Libro libro1 = new Libro();
		libro1.setTitulo("El Escarabajo");
		libro1.setEditorial("Mapel");
		libro1.setAnioPublicacion("2000");
		libro1.setISBN("sdf3323d5");
		libro1.setnPaginas("300");
		libro1.setAutor(autor);
		//this.iLibroService.insertar(libro1);
		
		
		//BUSCAR AUTOR
		Autor autor2 = this.iAutorService.buscar(1);
		Logg.info(autor2+"\n");
		
		
		//ACTUALIZAR AUTOR
		Autor autor3 = new Autor();
		autor3.setId(3);
		autor3.setEdad("34");
		autor3.setNombre("Dominik");
		autor3.setApellido("Bastidas");
		autor3.setPaisOrigen("España");
		autor3.setGenero("F");
		this.iAutorService.actualizar(autor3);
		Logg.info("\n");
	
		
		//ELIMINAR AUTOR
		this.iAutorService.eliminar(8);
	}


	
	
		
}
