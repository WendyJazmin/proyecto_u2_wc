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

import com.uce.edu.demo.cajero.repository.modelo.DetalleFactura;
import com.uce.edu.demo.cajero.repository.modelo.Factura;
import com.uce.edu.demo.cajero.service.IFacturaService;
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
	private IFacturaService iFacturaService;
	
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
		
		Factura fact = this.iFacturaService.consultar(1);
		Logg.info(fact.getNumero());
		Logg.info("fecha: "+fact.getFecha());
		
		Logg.info("Cliente: "+fact.getCliente().getNumeroTarjeta());
		
		List<DetalleFactura> detalles = fact.getDetalles();
		for(DetalleFactura deta: detalles) {
			Logg.info("Detalles: "+deta);
		}
	
	}

		
}
