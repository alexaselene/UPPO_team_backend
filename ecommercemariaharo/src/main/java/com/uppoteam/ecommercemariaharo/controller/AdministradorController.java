package com.uppoteam.ecommercemariaharo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uppoteam.ecommercemariaharo.model.Administrador;
import com.uppoteam.ecommercemariaharo.model.ChangePasswordAdmin;
import com.uppoteam.ecommercemariaharo.service.AdministradorService;

@RestController
@CrossOrigin("*")
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
	@PostMapping
	public void addAdministrador(@RequestBody Administrador administrador) {
		administradorservice.addAdministrador(administrador);
	}//addAdministrador
	
	@PutMapping
	public void updateAdministrador(@RequestBody ChangePasswordAdmin changePasswordAdmin) {
		administradorservice.updateAdministrador(changePasswordAdmin);
	}//ChangePasswordAdmin
	
	
		
}//class AdministradorController
