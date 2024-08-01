package com.keepcoding.app.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.keepcoding.app.web.entity.Registrador;
import com.keepcoding.app.web.entity.Usuario;

import com.keepcoding.app.web.service.UsuarioServices;

@Controller
public class UsuarioController {
	@Autowired
	private UsuarioServices usuarioService;
	
	@GetMapping({"/home"})
	public String index(Model modelo) {
		modelo.addAttribute("registrador", new Registrador());
		return "login";
		
	}
	@GetMapping("/usuario/new")
	public String newUsuarioForm(Model modelo) {
		Usuario usuario = new Usuario();
		modelo.addAttribute("usuario", usuario);
		return "crear_usuario";
	}
	@PostMapping("/usuario")
	public String saveUsuario(@ModelAttribute("usuario")Usuario usuario) {
		usuarioService.guardarUsuario(usuario);
		return "redirect:/home";
	}
	
	@GetMapping("/login")
	public String login(Model modelo,@ModelAttribute("registrador") Registrador registrador) {
		List<Usuario> listaUsuarios = usuarioService.listarTodosLosUsuarios();
		
		for (Usuario usuario : listaUsuarios) {
	        if ((usuario.getUsername().equals(registrador.getNombre()))&&(usuario.getPassword().equals(registrador.getPassword()))) {
	            
	            	return "redirect:/";
	            
	        }
	    }
		modelo.addAttribute("error", "Usuario y/o contraseña incorrectos");
	    return "login";
	
	}
	/*
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
	}*/
}
