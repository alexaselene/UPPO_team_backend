package com.uppoteam.ecommercemariaharo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uppoteam.ecommercemariaharo.model.ChangePassword;
import com.uppoteam.ecommercemariaharo.model.Usuarios;
import com.uppoteam.ecommercemariaharo.service.UsuariosService;

@RestController
@RequestMapping(path="/api/usuarios/")
public class UsuariosController {
	
   private final UsuariosService usuariosService;
@Autowired
public UsuariosController(UsuariosService usuariosService) {
	this.usuariosService = usuariosService;
}//constructor
@GetMapping
public List<Usuarios> getUsuarios(){
	return usuariosService.getUsuarios();
	
}//getUsuarios
@GetMapping(path="{prodId}")
public Usuarios getUsuario(@PathVariable("prodId") Long id){
	return usuariosService.getUsuario(id);
	}//getUsuarios

@DeleteMapping(path="{prodId}")
public void deleteUsuario(@PathVariable("prodId") Long id) {
	usuariosService.deleteUsuario(id);
}//deleteUsuarios

@PostMapping
public void addUsuario(@RequestBody Usuarios usuarios) {
	usuariosService.addUsuario(usuarios);
}//addProducto

@PutMapping
public void updateUsuario(@RequestBody ChangePassword changePassword ) {
	usuariosService.uppdateUsuario(changePassword);
}//ChangePassword 

}//class UsuariosController
