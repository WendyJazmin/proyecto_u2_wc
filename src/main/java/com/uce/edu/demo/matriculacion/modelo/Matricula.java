package com.uce.edu.demo.matriculacion.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
@Table(name = "matricula")
public class Matricula {
	
	@Id
	@Column(name = "matr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matr_id_seq")
	@SequenceGenerator(name="matr_id_seq", sequenceName = "matri_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "matr_fecha_matricula")
	private LocalDateTime fechaMatricula;
	
	@Column(name = "matr_valor_matricula")
	private BigDecimal valorMatricula;
	
	@OneToOne
	@JoinColumn(name = "matr_prop_id")
	private Propietario propietario1;
	
	
	@OneToOne
	@JoinColumn(name = "matr_vehi_id")
	private Vehiculo vehiculo;
	
	
	
	@Override
	public String toString() {
		return "Matricula [fechaMatricula = " + fechaMatricula + ", valorMatricula = " + valorMatricula + ", propietario = "
				+ propietario1 + ", vehiculo = " + vehiculo + "]";
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
		return propietario1;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario1 = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
}
