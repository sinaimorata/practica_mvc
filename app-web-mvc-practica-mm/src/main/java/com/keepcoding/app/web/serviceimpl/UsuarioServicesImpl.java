package com.keepcoding.app.web.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.app.web.entity.Usuario;
import com.keepcoding.app.web.repository.UsuarioRepositorio;
import com.keepcoding.app.web.service.UsuarioServices;

@Service
public class UsuarioServicesImpl implements UsuarioServices {
	
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	public void guardarUsuario(Usuario usuario) {
		usuarioRepositorio.save(usuario);
	}

	@Override
	public List<Usuario> listarTodosLosUsuarios() {
		return usuarioRepositorio.findAll();
	}
}
