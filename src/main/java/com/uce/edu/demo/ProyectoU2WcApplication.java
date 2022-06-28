package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.service.IEstudianteJdbcService;
import com.uce.edu.demo.estudiante.to.Estudiante;

@SpringBootApplication
public class ProyectoU2WcApplication implements CommandLineRunner{

	
	@Autowired
	private IEstudianteJdbcService iEstudianteJdbcService;

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estudiante estudiante = new Estudiante();
		estudiante.setId(1);
		estudiante.setNombre("Marco");
		estudiante.setApellido("Perez");
		estudiante.setEdad(23);
		estudiante.setNumeroTelefono("083247556");
		
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setId(2);
		estudiante2.setNombre("Jeff");
		estudiante2.setApellido("Satur");
		estudiante2.setEdad(18);
		estudiante2.setNumeroTelefono("097374573");
		
		Estudiante estudiante3 = new Estudiante();
		estudiante3.setId(3);
		estudiante3.setNombre("daniel");
		estudiante3.setApellido("Marlon");
		estudiante3.setEdad(24);
		estudiante3.setNumeroTelefono("0908772573");
		
		Estudiante estudiante4 = new Estudiante();
		estudiante4.setId(4);
		estudiante4.setNombre("Sara");
		estudiante4.setApellido("Lopez");
		estudiante4.setEdad(20);
		estudiante4.setNumeroTelefono("0900137474223");
		
		//insertar
		this.iEstudianteJdbcService.guardar(estudiante);
		this.iEstudianteJdbcService.guardar(estudiante2);
		this.iEstudianteJdbcService.guardar(estudiante3);
		this.iEstudianteJdbcService.guardar(estudiante4);


		//actualizar
		estudiante.setEdad(24);
		this.iEstudianteJdbcService.actualizar(estudiante);
		
		//buscar
		this.iEstudianteJdbcService.buscarPorId(2);
		
		//eliminar
		this.iEstudianteJdbcService.eliminar(4);
	}

}
