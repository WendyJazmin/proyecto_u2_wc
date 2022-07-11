package com.uce.edu.demo.matriculacion.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name = "matricula")
public class Matricula {

	//@Column(name = "matr_fechaMatricula")
	private LocalDateTime fechaMatricula;
	
	//@Column(name = "matr_valorMatricula")
	private BigDecimal valorMatricula;
	
	//@Column(name = "matr_propietario")
	private Propietario propietario;
	
	//@Column(name = "matr_vehiculo")
	private Vehiculo vehiculo;
	
	
	@Override
	public String toString() {
		return "Matricula [fechaMatricula = " + fechaMatricula + ", valorMatricula = " + valorMatricula + ", propietario = "
				+ propietario + ", vehiculo = " + vehiculo + "]";
	}
	
	
	//set y get
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
}
