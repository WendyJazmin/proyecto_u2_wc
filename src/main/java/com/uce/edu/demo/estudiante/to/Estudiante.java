package com.uce.edu.demo.estudiante.to;

public class Estudiante {

	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	private String numeroTelefono;
	
	
	
	@Override
	public String toString() {
		return "Estudiante [id = " + id + ", nombre = " + nombre + ", apellido = " + apellido + ", edad = " + edad
				+ ", numeroTelefono = " + numeroTelefono + "]";
	}
	//set y get
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	
}
