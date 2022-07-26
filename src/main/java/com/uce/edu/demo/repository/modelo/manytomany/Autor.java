package com.uce.edu.demo.repository.modelo.manytomany;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "autor")
public class Autor {

	@Id
	@Column(name = "auto_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_id_seq")
	@SequenceGenerator(name="auto_id_seq", sequenceName = "auto_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "auto_name")
	private String name;

	@ManyToMany(mappedBy = "autores")
	private Set<Libro> libros;
	
	//get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Libro> getLibros() {
		return libros;
	}

	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}
	
	
	
}
