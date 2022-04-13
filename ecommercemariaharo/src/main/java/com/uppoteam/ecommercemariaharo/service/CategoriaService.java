package com.uppoteam.ecommercemariaharo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uppoteam.ecommercemariaharo.model.Categoria;


@Service
public class CategoriaService {
	private final CategoriaRepository categoriaRepository;
	
	@Autowired
	public CategoriaService(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}

	// GET
	public List<Categoria> getCategoria() {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}
	
	
	public Categoria getCategoria(Long id) {
		return categoriaRepository.findById(id).orElseThrow(
				()-> new IllegalStateException("La categoria con el id " + id + "no existe."));
	}


}
