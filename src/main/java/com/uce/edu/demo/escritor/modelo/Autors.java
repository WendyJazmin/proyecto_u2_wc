package com.uce.edu.demo.escritor.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "autors")
public class Autors {

	@Id
	@Column(name = "auto_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_id_seq")
	@SequenceGenerator(name="auto_id_seq", sequenceName = "auto_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "auto_nombre")
	private String nombre;
	
	@Column(name = "auto_apellido")
	private String apellido;
	
	@Column(name = "auto_edad")
	private String edad;
	
	@Column(name = "auto_pais_origen")
	private String paisOrigen;
	
	@Column(name = "auto_genero")
	private String genero;

	@OneToMany(mappedBy = "autor")
	private List<Libros> libros;
	
	
	
	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", paisOrigen="
				+ paisOrigen + ", genero=" + genero + "]";
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

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Libros> getLibros() {
		return libros;
	}

	public void setLibros(List<Libros> libros) {
		this.libros = libros;
	}
	
	
	
}
