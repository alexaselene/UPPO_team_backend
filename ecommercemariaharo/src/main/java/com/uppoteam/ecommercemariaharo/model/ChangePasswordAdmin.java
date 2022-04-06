package com.uppoteam.ecommercemariaharo.model;

public class ChangePasswordAdmin {
	private String usuario;
	private String contraseña;
	private String nueva_contraseña;
	public ChangePasswordAdmin(String usuario, String contraseña, String nueva_contraseña) {
		
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.nueva_contraseña = nueva_contraseña;
	}//constructor
	public ChangePasswordAdmin() {} //constructor vacío
	
	//Abajo get y set
	
	public String getUsuario() {
		return usuario;
	}//getUsuario
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}//setUsuario
	public String getContraseña() {
		return contraseña;
	}//getContraseña
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}//setContraseña
	public String getNueva_contraseña() {
		return nueva_contraseña;
	}//getNueva_contraseña
	public void setNueva_contraseña(String nueva_contraseña) {
		this.nueva_contraseña = nueva_contraseña;
	}//setNueva_contraseña
	@Override
	public String toString() {
		return "ChangePasswordAdmin [usuario=" + usuario + ", contraseña=" + contraseña + ", nueva_contraseña="
				+ nueva_contraseña + "]";
	}//toString
	
}//class ChangePasswordAdmin
