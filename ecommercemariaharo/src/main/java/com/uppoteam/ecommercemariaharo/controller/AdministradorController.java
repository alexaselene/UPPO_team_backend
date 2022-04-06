package com.uppoteam.ecommercemariaharo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uppoteam.ecommercemariaharo.model.Administrador;
import com.uppoteam.ecommercemariaharo.service.AdministradorService;

@RestController
@RequestMapping(path="/api/administradores/")
public class AdministradorController {
	private final AdministradorService administradorservice;
	@Autowired
	public AdministradorController(AdministradorService administradorservice) {
		this.administradorservice=administradorservice;
	}//constructor 
	
	@GetMapping
	public List <Administrador> getAdministrador(){
		return administradorservice.getAdministrador();
	}//get administrador
	
	@GetMapping(path="{prodId}")
	public Administrador getAdministrador(@PathVariable("prodId")Long id) {
		return administradorservice.getAdministrador(id);
	}//get administrador
	
	@DeleteMapping(path="{prodId}")
	public void deleteAdministrador(@PathVariable("prodId")Long id) {
		administradorservice.deleteAdministrador(id);
	}//delete administrador
	
	
		
}//class AdministradorController
