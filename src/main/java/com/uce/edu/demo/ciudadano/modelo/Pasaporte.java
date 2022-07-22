package com.uce.edu.demo.ciudadano.modelo;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pasaporte")
public class Pasaporte {
	
	@Id
	@Column(name="pasa_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pasa_id_seq")
	@SequenceGenerator(name="pasa_id_seq", sequenceName = "pasa_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name="pasa_numero")
	private String numero;
	
	@Column(name="pasa_fecha_emision")
	private LocalDateTime fechaEmision;
	
	@Column(name="pasa_fecha_caducidad")
	private LocalDateTime fechaCaducidad;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pasa_id_ciudadano")
	private Ciudadanos ciudadano;

	
	
	@Override
	public String toString() {
		return "Pasaporte [id=" + id + ", numero=" + numero + ", fechaEmision=" + fechaEmision + ", fechaCaducidad="
				+ fechaCaducidad +"]";
	}

	//get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public LocalDateTime getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDateTime fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public Ciudadanos getCiudadano() {
		return ciudadano;
	}

	public void setCiudadano(Ciudadanos ciudadano) {
		this.ciudadano = ciudadano;
	}

	
}