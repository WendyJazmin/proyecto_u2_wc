package com.uce.edu.demo;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
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
import  com.uce.edu.demo.repository.modelo.PersonaSencilla;
import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;



@SpringBootApplication
public class ProyectoU2WcApplication implements CommandLineRunner{


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
		
	Hotel hotel = new Hotel();
	hotel.setDireccion("Av. 6 de Diciembre");
	hotel.setNombre("Domundi");
	this.ihotelervice.insertar(hotel);
	
	Hotel hotel1 = new Hotel();
	hotel1.setId(1);
	
	
	Habitacion habitacion = new Habitacion();
	habitacion.setNumero("A36");
	habitacion.setPiso("9");
	habitacion.setTipo("Individual");

	habitacion.setHotel(hotel1);
	
	this.ihabitacionervice.insertar(habitacion);
	
	}

		
}
