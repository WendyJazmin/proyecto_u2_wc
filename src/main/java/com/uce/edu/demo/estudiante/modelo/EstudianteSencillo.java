package com.uce.edu.demo.estudiante.modelo;

import java.io.Serializable;

public class EstudianteSencillo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private Integer edad;
	
	public EstudianteSencillo() {
		
	}
	
	
	public EstudianteSencillo(String nombre, Integer edad) {		this.nombre = nombre;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "EstudianteSecillo [nombre = " + nombre + ", edad = " + edad + "]";
	}


	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	
}
