package com.uppoteam.ecommercemariaharo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uppoteam.ecommercemariaharo.model.Usuarios;
import com.uppoteam.ecommercemariaharo.service.UsuariosService;

@RestController
@RequestMapping(path="/api/login/")

public class LoginController {
	private final UsuariosService usuariosService;
	@Autowired
	public LoginController(UsuariosService usuariosService) {
		this.usuariosService=usuariosService;
	}//constructor LoginController
	
	@PostMapping
	public String login(@RequestBody Usuarios usuarios) {
		return usuariosService.validateUsuario(usuarios);
	}//login
}//LoginController
