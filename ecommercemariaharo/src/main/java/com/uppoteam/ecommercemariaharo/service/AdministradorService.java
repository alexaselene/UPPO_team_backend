package com.uppoteam.ecommercemariaharo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uppoteam.ecommercemariaharo.model.Administrador;

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

	
	

}//AdministradorService
