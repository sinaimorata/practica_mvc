package com.keepcoding.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.keepcoding.app.web.entity.Alumno;
import com.keepcoding.app.web.service.AlumnoServices;

@Controller
public class AlumnoController {
	@Autowired
	private AlumnoServices alumnoService;
	
	@GetMapping({"/", "/alumnos"})
	public String index(Model modelo) {
		modelo.addAttribute("alumnos",alumnoService.listarTodosLosAlumnos());
		return "alumno";
		
	}
	@GetMapping("/alumno/new")
	public String newAlumnoForm(Model modelo) {
		Alumno alumno = new Alumno();
		modelo.addAttribute("alumno", alumno);
		return "crear_alumno";
	}
	@PostMapping("/alumno")
	public String saveAlumno(@ModelAttribute("alumno")Alumno alumno) {
		alumnoService.guardarAlumno(alumno);
		return "redirect:/";
	}
	@GetMapping("/alumno/editar/{id}")
	public String updateAlumnoForm(@PathVariable Long id, Model modelo) {
	
		modelo.addAttribute("alumno_update",alumnoService.obtenerAlumno(id));
		return "editar_alumno";
	}
	
	@PostMapping("/alumno/{id}")
	public String updateAlumno(@PathVariable Long id, @ModelAttribute("alumno_update")Alumno alumno) {
		Alumno alumnoExistente = alumnoService.obtenerAlumno(id);
		alumnoExistente.setId(id);
		alumnoExistente.setNombre(alumno.getNombre());
		alumnoExistente.setApellido(alumno.getApellido());
		alumnoExistente.setTelefono(alumno.getTelefono());
		alumnoExistente.setEmail(alumno.getEmail());
		alumnoExistente.setDni(alumno.getDni());
		alumnoExistente.setFecha_nac(alumno.getFecha_nac());
		
		alumnoService.actualizarAlumno(alumnoExistente);
		
		return "redirect:/";
		
	}
	
	@GetMapping("/alumno/delete/{id}")
	public String deleteAlumno(@PathVariable Long id) {
		
		alumnoService.eliminarAlumno(id);
		return "redirect:/";
	}
}



