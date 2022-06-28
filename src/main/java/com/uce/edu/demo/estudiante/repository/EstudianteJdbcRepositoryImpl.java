package com.uce.edu.demo.estudiante.repository;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.estudiante.to.Estudiante;

@Repository
public class EstudianteJdbcRepositoryImpl implements IEstudianteJdbcRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static Logger LogJava = Logger.getLogger(EstudianteJdbcRepositoryImpl.class);
	
	@Override
	public Estudiante buscarPorId(int id) {
		// TODO Auto-generated method stub
		LogJava.info("se busco al estudiante con id: "+id);
		return this.jdbcTemplate.queryForObject("select * from estudiante where id=?", new Object[] {id},
				new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
		
	}
	

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("insert into estudiante (id, nombre, apellido, edad, telefono) values (?,?,?,?,?)",
					new Object[] {estudiante.getId(),estudiante.getNombre(),estudiante.getApellido(),estudiante.getEdad(), estudiante.getNumeroTelefono()});
		LogJava.info("se inserto al estudiante: "+estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("update estudiante set nombre=?, apellido=?, edad=?, telefono=? where id=?",
				new Object[] {estudiante.getNombre(),estudiante.getApellido(),estudiante.getEdad(),estudiante.getNumeroTelefono(),estudiante.getId()});
		LogJava.info("se actualizo al estudiante: "+estudiante);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("delete from estudiante where id=?", new Object[] {id});
		LogJava.info("se elimino al estudiante con id: "+id);
	}

}
