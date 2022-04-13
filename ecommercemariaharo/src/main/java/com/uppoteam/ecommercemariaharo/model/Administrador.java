package com.uppoteam.ecommercemariaharo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="administradores")
public class Administrador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idadministradores", unique = true, nullable = false)
	private int id;
	private String usuario;
	private String contrasena;
	private static int total=0;
	
	
	public Administrador(int id, String usuario, String contrasena) {
		
		this.usuario = usuario;
		this.contrasena = contrasena;
		total ++;
		this.id=total;
	}//constructor
	
	


	public Administrador() {
		
	}//constructor 




	public int getId() {
		return id;
	}



	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	
	//getters y setters
	
	@Override
	public String toString() {
		return "Administrador [id=" + id + ", usuario=" + usuario + ", contrasena=" + contrasena + "]";
	}//toString
	
	
	
}//Administrador
