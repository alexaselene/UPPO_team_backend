package com.uppoteam.ecommercemariaharo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uppoteam.ecommercemariaharo.model.Usuarios;

@Service
public class UsuariosService {
	
	private final UsuariosRepository usuariosRepository;

	@Autowired
	public UsuariosService(UsuariosRepository usuariosRepository) {
		
		this.usuariosRepository = usuariosRepository;
	}//constructor
	
	public List<Usuarios> getUsuarios(){
		return usuariosRepository.findAll();
	}//getUsuarios
	
	public Usuarios getUsuario(Long id) {
		return usuariosRepository.findById(id).orElseThrow(
				()-> new IllegalStateException("El Usuario con el id " + id + "no existe.") );
			
		}//getUsuario
		
		public void deleteUsuario(Long id) {
			if(usuariosRepository.existsById(id)) {
				usuariosRepository.deleteById(id);
			}//if exist
		}//deleteUsuario
		public void addUsuario(Usuarios usuarios) {
			Optional<Usuarios> userByName=usuariosRepository.findByNombre_usuario(usuarios.getNombre_usuario());
			if(userByName.isPresent()) {
				throw new IllegalStateException("El usuario con el nombre [" + usuarios.getNombre_usuario() + "] YA existe.");
			
			}else {
				usuariosRepository.save(usuarios);
			}//else
		}//addUsuario
		
}//class UsuariosService