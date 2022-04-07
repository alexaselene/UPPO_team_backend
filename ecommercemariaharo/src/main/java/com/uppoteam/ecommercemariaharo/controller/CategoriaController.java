package com.uppoteam.ecommercemariaharo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uppoteam.ecommercemariaharo.model.Categoria;
import com.uppoteam.ecommercemariaharo.service.CategoriaService;
import com.uppoteam.ecommercemariaharo.service.PedidosService;

@RestController
@RequestMapping (path = "/api/categoria/")
public class CategoriaController {
	private final CategoriaService categoriaService;
	
	@Autowired
	public CategoriaController(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}
	
	// GET
		@GetMapping
		public List<Categoria> getCategoria(){
			return categoriaService.getCategoria();
		}
	

}//CategoriaController
