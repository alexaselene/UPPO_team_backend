package com.uppoteam.ecommercemariaharo.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uppoteam.ecommercemariaharo.model.Productos;



public interface ProductosRepository extends JpaRepository<Productos, Long> {

	@Query("SELECT p FROM Productos p WHERE p.nombre=?1")//JPQL
	 Optional<Productos>	findByNombre (String nombre);
	
	
}//ProductosRepository
