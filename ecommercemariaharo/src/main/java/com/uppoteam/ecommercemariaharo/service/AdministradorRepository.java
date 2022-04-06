package com.uppoteam.ecommercemariaharo.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uppoteam.ecommercemariaharo.model.Administrador;

public interface AdministradorRepository 
	extends JpaRepository<Administrador,Long>{
		@Query("SELECT u FROM Administrador u WHERE u.usuario=?1")
		Optional<Administrador> findByUsuario(String usuario);
	}//AdministradorRepository


