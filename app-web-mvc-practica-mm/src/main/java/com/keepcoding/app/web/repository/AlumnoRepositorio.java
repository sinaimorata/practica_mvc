package com.keepcoding.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keepcoding.app.web.entity.Alumno;

@Repository
public interface AlumnoRepositorio extends JpaRepository<Alumno,Long> {

	
}
