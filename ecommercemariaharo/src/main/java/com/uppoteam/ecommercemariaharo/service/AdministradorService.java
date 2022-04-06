package com.uppoteam.ecommercemariaharo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uppoteam.ecommercemariaharo.model.Administrador;

import com.uppoteam.ecommercemariaharo.model.ChangePasswordAdmin;

@Service
public class AdministradorService {
	private final AdministradorRepository administradorRepository;
	@Autowired 
	public AdministradorService(AdministradorRepository administradorRepository) {
	
		this.administradorRepository = administradorRepository;
	}//constructor
	
	public List<Administrador> getAdministrador() {
		
		return administradorRepository.findAll();
	}//getAdministrador

	public Administrador getAdministrador(Long id) {
		
		return administradorRepository.findById(id).orElseThrow(
				()->new IllegalStateException("El usuario con el id" + id + "no existe"));
				
	}//administradorRepository

	public void deleteAdministrador(Long id) {
		if(administradorRepository.existsById(id)) {
			administradorRepository.deleteById(id);
		}//if exists
		
	}//deleteAdministrador

	public void addAdministrador(Administrador administrador) {
		Optional<Administrador> userByName=administradorRepository.findByUsuario(administrador.getUsuario());
		if(userByName.isPresent()) {
			throw new IllegalStateException("El usuario con el nombre [" + administrador.getUsuario() + "] ya existe.");
			
		}else {
			administradorRepository.save(administrador);
		}//else
	}//addAdministrador

	public void updateAdministrador(ChangePasswordAdmin changePasswordAdmin) {
		Optional<Administrador> userByName=administradorRepository.findByUsuario(changePasswordAdmin.getUsuario());
		if(userByName.isPresent()) {
			Administrador a=userByName.get();
			if(a.getContraseña().equals(changePasswordAdmin.getContraseña())) {
				a.setContraseña(changePasswordAdmin.getNueva_contraseña());
				administradorRepository.save(a);
			}//password
		}//if is present
	}//updateAdmin

	public String validateAdministrador(Administrador administrador) {
		String res="Nombre de usuario o contraseña incorrectos";
		Optional<Administrador> userByName=administradorRepository.findByUsuario(administrador.getUsuario());
		if(userByName.isPresent()) {
			Administrador a=userByName.get();
			if(a.getContraseña().equals(administrador.getContraseña())) {
				res="Datos de usuario correctos";
			}//if password
		}//if is present
		return res;
	}//validateAdmin

}//AdministradorService
