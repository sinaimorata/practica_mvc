package com.keepcoding.app.web.service;

import java.util.List;

import com.keepcoding.app.web.entity.Alumno;
import com.keepcoding.app.web.entity.Usuario;

public interface UsuarioServices {
	public void guardarUsuario(Usuario usuario);
	//método q devuelve una lista de usuarios
	public List<Usuario> listarTodosLosUsuarios();
}
