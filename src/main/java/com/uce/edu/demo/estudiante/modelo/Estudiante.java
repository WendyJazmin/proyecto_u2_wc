package com.uce.edu.demo.estudiante.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.uce.edu.demo.repository.modelo.Persona;

@Entity
@Table(name = "estudiante")//nombre de la tabla
@NamedQuery(name="Estudiante.buscarPorEdad", query="SELECT e FROM Estudiante e WHERE e.edad < :datoEdad order by e.nombre DESC")
@NamedQuery(name="Estudiante.buscarPorNombre", query="SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre order by e.nombre ")
@NamedQuery(name="Estudiante.buscarPorApellido", query="SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido order by e.edad ")
@NamedNativeQueries({
	@NamedNativeQuery(name="Estudiante.buscarPorNumTelefonoNative",query="SELECT * FROM estudiante  WHERE estu_telefono = :datoTelefono",resultClass=Estudiante.class),
	@NamedNativeQuery(name = "Estudiante.buscarPorIDApellidoNative",query="SELECT * FROM estudiante  WHERE estu_id = :datoId AND estu_apellido = :datoApellido",resultClass=Estudiante.class)
})

public class Estudiante {

	@Id
	@Column(name = "estu_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estu__id_seq")
	@SequenceGenerator(name="estu__id_seq", sequenceName = "estu__id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "estu_nombre")
	private String nombre;
	
	@Column(name = "estu_apellido")
	private String apellido;
	
	@Column(name = "estu_edad")
	private Integer edad;
	
	@Column(name = "estu_telefono")
	private String numeroTelefono;
	

	@Override
	public String toString() {
		return "Estudiante [id = " + id + ", nombre = " + nombre + ", apellido = " + apellido + ", edad = " + edad
				+ ", numeroTelefono = " + numeroTelefono + "]";
	}


	//set y get
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
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


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public String getNumeroTelefono() {
		return numeroTelefono;
	}


	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}


	
	
	
}
