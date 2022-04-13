package com.uppoteam.ecommercemariaharo.controller;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uppoteam.ecommercemariaharo.jwt.config.JwtFilter;
import com.uppoteam.ecommercemariaharo.model.TokenUsuario;
import com.uppoteam.ecommercemariaharo.model.Usuarios;
import com.uppoteam.ecommercemariaharo.service.UsuariosService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@CrossOrigin("*")
@RequestMapping(path="/api/login/")

public class LoginController {
	private final UsuariosService usuariosService;
	@Autowired
	public LoginController(UsuariosService usuariosService) {
		this.usuariosService=usuariosService;
	}//constructor LoginController
	
	@PostMapping
	public TokenUsuario login(@RequestBody Usuarios usuarios) throws ServletException {
		if(usuariosService.validateUsuario(usuarios)) {
			return new TokenUsuario(generateToken(usuarios.getNombre_usuario()));
		}//if
		throw new ServletException("Nombre de usuario o contrasena incorrectos");
		
	}//login
	private String generateToken(String username) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, 10);
		return Jwts.builder().setSubject(username).claim("role", "user")
				.setIssuedAt(new Date()).setExpiration(calendar.getTime())
				.signWith(SignatureAlgorithm.HS256, JwtFilter.secret).compact();
		}// generateToken
}//LoginController
