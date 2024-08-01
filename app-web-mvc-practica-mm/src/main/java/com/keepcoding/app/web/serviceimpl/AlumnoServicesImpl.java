package com.keepcoding.app.web.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.keepcoding.app.web.entity.Alumno;
import com.keepcoding.app.web.repository.AlumnoRepositorio;
import com.keepcoding.app.web.service.AlumnoServices;

@Service
public class AlumnoServicesImpl implements AlumnoServices {

	@Autowired
	private AlumnoRepositorio alumnoRepositorio;
		
	@Override
	public List<Alumno> listarTodosLosAlumnos(){
		return alumnoRepositorio.findAll();
	}

	@Override
	public Alumno guardarAlumno(Alumno alumno) {
		
		return alumnoRepositorio.save(alumno);
	}

	
	@Override
	public Alumno obtenerAlumno(Long id) {
		
		return alumnoRepositorio.findById(id).get();
	}

	@Override
	public Alumno actualizarAlumno(Alumno alumno) {
		
		return alumnoRepositorio.save(alumno);
	}

	@Override
	public void eliminarAlumno(Long id) {
		
		alumnoRepositorio.deleteById(id);
	}
	

	
}
