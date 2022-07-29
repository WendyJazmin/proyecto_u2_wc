package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import com.uce.edu.demo.matriculacion.modelo.Matricula;

public interface IMatriculaJpaService {

	public BigDecimal calcular(BigDecimal precio);
	

}
