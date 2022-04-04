package com.uppoteam.ecommercemariaharo.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uppoteam.ecommercemariaharo.model.Usuarios;

public interface UsuariosRepository 
extends JpaRepository<Usuarios, Long> {
	 @Query ("SELECT u FROM Usuario u WHERE u.username=?1")
	Optional<Usuarios> findByUsername (String username);
}//Interface UsuariosRepository
