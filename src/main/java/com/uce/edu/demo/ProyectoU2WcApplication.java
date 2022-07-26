package com.uce.edu.demo;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import com.uce.edu.demo.service.IAutor2Service;
import com.uce.edu.demo.service.ICiudadanoService;
import com.uce.edu.demo.service.IHabitacionService;
import com.uce.edu.demo.service.IHotelService;
import com.uce.edu.demo.service.ILibro2Service;
import com.uce.edu.demo.service.ILibroService;
import com.uce.edu.demo.ciudadano.service.ICiudadanosService;

import com.uce.edu.demo.service.ILibro2_Autor2Service;


import  com.uce.edu.demo.repository.modelo.PersonaSencilla;
import com.uce.edu.demo.repository.modelo.manytomany.Autor;
import com.uce.edu.demo.repository.modelo.manytomany.Libro;
import com.uce.edu.demo.repository.modelo.onetomany.Autor2;
import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;
import com.uce.edu.demo.repository.modelo.onetomany.Libro2;
import com.uce.edu.demo.repository.modelo.onetomany.Libro2_Autor2;



@SpringBootApplication
public class ProyectoU2WcApplication implements CommandLineRunner{

	@Autowired
	private ILibro2Service iLibro2Service;
	
	@Autowired
	private IAutor2Service iAutor2Service;
	
	@Autowired
	private ILibro2_Autor2Service ILibro2_Autor2Service;

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
		
		//INSERTAR LIBRO2
		Libro2 libro1 = new Libro2();
		libro1.setTitulo("Escarabajo");
		libro1.setCantidadPaginas("400");
		
		Libro2 libro3 = new Libro2();
		libro3.setTitulo("Fabulas de Esopo");
		libro3.setCantidadPaginas("550");
		
		Libro2 libro6 = new Libro2();
		libro6.setTitulo("Amigos");
		libro6.setCantidadPaginas("600");
		
		//this.iLibro2Service.insertar(libro1);
		//this.iLibro2Service.insertar(libro3);
		//this.iLibro2Service.insertar(libro6);
		
		
		//INSERTAR AUTOR2
		Autor2 autor1 = new Autor2();
		autor1.setName("Rafael Vegas");
		
		Autor2 autor2 = new Autor2();
		autor2.setName("Marlon Perez");
		
		
		Autor2 autor6 = new Autor2();
		autor6.setName("Daniel Naranjo");
		
		//this.iAutor2Service.insertar(autor1);
		//this.iAutor2Service.insertar(autor2);
		//this.iAutor2Service.insertar(autor6);
		
		
		
		
		// 1 libro tiene 2 autores
		Libro2 libro2 = new Libro2();
		libro2.setId(24);
		
		Autor2 autor3 = new Autor2();
		autor3.setId(24);
		
		
		Autor2 autor4 = new Autor2();
		autor4.setId(25);
		
		Libro2_Autor2 Libro2_Autor2  = new Libro2_Autor2 ();
		Libro2_Autor2.setLibro2(libro2);
		Libro2_Autor2.setAutor2(autor4);
		
		//this.ILibro2_Autor2Service.insertar(Libro2_Autor2);
		
		
		
		
		// 1 autor escribio 2 libros
		Autor2 autor5 = new Autor2();
		autor5.setId(23);
	
		Libro2 libro4 = new Libro2();
		libro4.setId(25);
		
		Libro2 libro5 = new Libro2();
		libro5.setId(26);
		
		Libro2_Autor2 Libro2_Autor2_2  = new Libro2_Autor2 ();
		Libro2_Autor2_2.setLibro2(libro5);
		Libro2_Autor2_2.setAutor2(autor5);
		
		this.ILibro2_Autor2Service.insertar(Libro2_Autor2_2);
		
	
		
	}


	
	
		
}
