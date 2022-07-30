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

import com.uce.edu.demo.citasmedicas.modelo.Doctor;
import com.uce.edu.demo.citasmedicas.modelo.Paciente;
import com.uce.edu.demo.citasmedicas.service.IDoctorService;
import com.uce.edu.demo.citasmedicas.service.IPacienteService;







@SpringBootApplication
public class ProyectoU2WcApplication implements CommandLineRunner{
	@Autowired
	private IDoctorService iDoctorService;
	

	@Autowired
	private IPacienteService IPacienteService;
	
	private static Logger logg = Logger.getLogger(ProyectoU2WcApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//insetando doctores
		
		Doctor doctor1 = new Doctor();
		doctor1.setCedula("12334");
		doctor1.setNombre("Jeff");
		doctor1.setApellido("Satur");
		doctor1.setFechaNacimiento(LocalDateTime.now());
		doctor1.setNumeroConsultorio("op23");
		doctor1.setTitulo("Medico General");
		doctor1.setSalario(new BigDecimal(800));
		
		this.iDoctorService.insertar(doctor1);
		
		Doctor doctor2 = new Doctor();
		doctor2.setCedula("1223244");
		doctor2.setNombre("Jessie");
		doctor2.setApellido("Salas");
		doctor2.setFechaNacimiento(LocalDateTime.now());
		doctor2.setNumeroConsultorio("op23e");
		doctor2.setTitulo("Dermatologo");
		doctor2.setSalario(new BigDecimal(1000));
		
		this.iDoctorService.insertar(doctor2);
		
		Paciente pac1 = new Paciente();
		pac1.setCedula("223435");
		pac1.setNombre("Alex");
		pac1.setApellido("Alvear");
		pac1.setFechaNacimiento(LocalDateTime.now());
		pac1.setCodigoIess("fdefo988");
		pac1.setEstatura(1.76);
		pac1.setPeso(76.0);
		pac1.setGenero("M");
		
		this.IPacienteService.insertar(pac1);
		
		Paciente pac2 = new Paciente();
		pac2.setCedula("21221235");
		pac2.setNombre("Paola");
		pac2.setApellido("Perez");
		pac2.setFechaNacimiento(LocalDateTime.now());
		pac2.setCodigoIess("f2ew3eo8");
		pac2.setEstatura(1.60);
		pac2.setPeso(56.0);
		pac1.setGenero("F");
		
		this.IPacienteService.insertar(pac2);
		
	
	}

		
}
