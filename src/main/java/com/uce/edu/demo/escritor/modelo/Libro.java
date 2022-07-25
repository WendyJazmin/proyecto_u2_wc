package com.uce.edu.demo.escritor.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "libro")
public class Libro {
	
	@Id
	@Column(name = "libr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libr_id_seq")
	@SequenceGenerator(name="libr_id_seq", sequenceName = "libr_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "libr_titulo")
	private String titulo;
	
	@Column(name = "libr_anio_publicacion")
	private String anioPublicacion;
	
	@Column(name = "libr_isbn")
	private String ISBN;
	
	@Column(name = "libr_paginas")
	private String nPaginas;
	
	@Column(name = "libr_editorial")
	private String editorial;

	@ManyToOne
	@JoinColumn(name = "libr_id_autor")
	private Autor autor;
	
	

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + ", ISBN=" + ISBN
				+ ", nPaginas=" + nPaginas + ", editorial=" + editorial + ", autor=" + autor + "]";
	}

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

	public String getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(String anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getnPaginas() {
		return nPaginas;
	}

	public void setnPaginas(String nPaginas) {
		this.nPaginas = nPaginas;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	

}
