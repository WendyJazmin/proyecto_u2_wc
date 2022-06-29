package com.uce.edu.demo.to;

public class PersonaTo {

	private int id;
	private String nombre;
	private String apellido;
	
	

	@Override
	public String toString() {
		return "Persona [id = " + id + ", nombre = " + nombre + ", apellido = " + apellido + "]";
	}
	//set y get
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
