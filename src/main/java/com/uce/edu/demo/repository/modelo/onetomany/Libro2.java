package com.uce.edu.demo.repository.modelo.onetomany;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name= "libro2")
public class Libro2 {
	
	@Id
	@Column(name = "libr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libr_id_seq")
	@SequenceGenerator(name="libr_id_seq", sequenceName = "libr_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "libr_titulo")
	private String titulo;
	
	@Column(name = "libr_cantidad_paginas")
	private String cantidadPaginas;

	@OneToMany(mappedBy = "libro2")
	private List<Libro2_Autor2> autores;
	
	//set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCantidadPaginas() {
		return cantidadPaginas;
	}

	public void setCantidadPaginas(String cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}

	public List<Libro2_Autor2> getAutores() {
		return autores;
	}

	public void setAutores(List<Libro2_Autor2> autores) {
		this.autores = autores;
	}

	
	

}
