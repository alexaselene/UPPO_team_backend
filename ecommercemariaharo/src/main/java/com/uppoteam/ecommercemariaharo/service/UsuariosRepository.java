package com.uppoteam.ecommercemariaharo.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uppoteam.ecommercemariaharo.model.Usuarios;

public interface UsuariosRepository 
extends JpaRepository<Usuarios, Long> {
	 @Query ("SELECT u FROM Usuarios u WHERE u.nombre_usuario=?1")
	Optional<Usuarios> findByNombre_usuario (String nombre_usuario);
}//Interface UsuariosRepository
