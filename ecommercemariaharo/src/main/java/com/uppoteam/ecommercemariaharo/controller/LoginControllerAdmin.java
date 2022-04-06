package com.uppoteam.ecommercemariaharo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uppoteam.ecommercemariaharo.model.Administrador;
import com.uppoteam.ecommercemariaharo.service.AdministradorService;

@RestController
@RequestMapping(path="/api/login/admin/")

public class LoginControllerAdmin {
	private final AdministradorService administradorService;
	@Autowired
	public LoginControllerAdmin(AdministradorService administradorService) {
		this.administradorService = administradorService;
    }//constructorLoginControllerAdmin
	
	@PostMapping
	public String loginAdmin(@RequestBody Administrador administrador) {
		return administradorService.validateAdministrador(administrador);
	}//loginAdmin
	
	
}//classLoginControllerAdmin
