package com.keepcoding.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.keepcoding.app.web.entity.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario,Long> {

}
