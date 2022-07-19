package com.uce.edu.demo.estudiante.modelo;

import java.io.Serializable;

public class EstudianteContadorEdad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer edad;
	private Long cantidad;
	
	
	
	public EstudianteContadorEdad() {
		
	}
	
	public EstudianteContadorEdad(Integer edad, Long cantidad) {
		this.edad = edad;
		this.cantidad = cantidad;
	}
	
	
	@Override
	public String toString() {
		return "EstudianteContadorEdad [edad = " + edad + ", cantidad = " + cantidad + " estudiantes]";
	}

	//get y set
	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	
	
}
