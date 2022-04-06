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
	private String contrase�a;
	private static int total=0;
	
	
	public Administrador(int id, String usuario, String contrase�a) {
		
		this.usuario = usuario;
		this.contrase�a = contrase�a;
		total ++;
		this.id=total;
	}//constructor
	
	


	public Administrador() {
		
	}//constructor vac�o




	public int getId() {
		return id;
	}



	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContrase�a() {
		return contrase�a;
	}


	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	
	//getters y setters
	
	@Override
	public String toString() {
		return "Administrador [id=" + id + ", usuario=" + usuario + ", contrase�a=" + contrase�a + "]";
	}//toString
	
	
	
}//Administrador
