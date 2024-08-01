package com.keepcoding.app.web.service;

import java.util.List;

import com.keepcoding.app.web.entity.Alumno;

public interface AlumnoServices {
	//método q devuelve una lista de alumnos
	public List<Alumno> listarTodosLosAlumnos();
	
	//método para GUARDAR nuevo alummos
	public Alumno guardarAlumno(Alumno alumno);
	
	//método para OBTENER alumno por id
	public Alumno obtenerAlumno(Long id);
	
	//método para ACTUALIZAR un alumno
	public Alumno actualizarAlumno(Alumno alumno);
	
	//método para ELIMINAR un alumno
	public void eliminarAlumno(Long id);
	
}
