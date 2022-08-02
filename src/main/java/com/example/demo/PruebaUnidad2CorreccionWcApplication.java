package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.service.IDoctorService;
import com.example.demo.service.IGestorCitaMedicaService;
import com.example.demo.service.IPacienteService;



@SpringBootApplication
public class PruebaUnidad2CorreccionWcApplication implements CommandLineRunner{
	
	@Autowired
	private IDoctorService iDoctorService;
	

	@Autowired
	private IPacienteService IPacienteService;
	
	@Autowired
	private IGestorCitaMedicaService iGestorCitaMedicaService;
	
	
	private static Logger logg = Logger.getLogger(PruebaUnidad2CorreccionWcApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad2CorreccionWcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//insetando doctores
		
				Doctor doctor1 = new Doctor();
				doctor1.setCedula("12334");
				doctor1.setNombre("Jeff");
				doctor1.setApellido("Satur");
				doctor1.setFechaNacimiento(LocalDateTime.now());
				doctor1.setNumeroConsultorio("op23");
				doctor1.setCodigoSenescyt("3242565");
				doctor1.setGenero("M");
				
				
				//this.iDoctorService.insertar(doctor1);
				
				Doctor doctor2 = new Doctor();
				doctor2.setCedula("1223244");
				doctor2.setNombre("Jessie");
				doctor2.setApellido("Salas");
				doctor2.setFechaNacimiento(LocalDateTime.now());
				doctor2.setNumeroConsultorio("op23e");
				doctor2.setCodigoSenescyt("233ojjd");
				doctor2.setGenero("M");
				
				
				//this.iDoctorService.insertar(doctor2);
				
				Paciente pac1 = new Paciente();
				pac1.setCedula("223435");
				pac1.setNombre("Alex");
				pac1.setApellido("Alvear");
				pac1.setFechaNacimiento(LocalDateTime.now());
				pac1.setCodigoSeguro("233444t");
				pac1.setEstatura(1.76);
				pac1.setPeso(76.0);
				pac1.setGenero("M");
				
				//this.IPacienteService.insertar(pac1);
				
				Paciente pac2 = new Paciente();
				pac2.setCedula("21221235");
				pac2.setNombre("Paola");
				pac2.setApellido("Perez");
				pac2.setFechaNacimiento(LocalDateTime.now());
				pac2.setCodigoSeguro("ed34435");
				pac2.setEstatura(1.60);
				pac2.setPeso(56.0);
				pac1.setGenero("F");
				
				//this.IPacienteService.insertar(pac2);
		
				//generar cita
				this.iGestorCitaMedicaService.generarCita("2132434353", LocalDateTime.now(), new BigDecimal(40), "Inca", "1223244", "21221235");
				//actualizar cita medica
				this.iGestorCitaMedicaService.actualizarCita("3232425", "Covid", "Paracetamol", LocalDateTime.now());
	}

}
