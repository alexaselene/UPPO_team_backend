package com.uppoteam.ecommercemariaharo.model;

public class ChangePasswordAdmin {
	private String usuario;
	private String contrasena;
	private String nueva_contrasena;
	public ChangePasswordAdmin(String usuario, String contrasena, String nueva_contrasena) {
		
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.nueva_contrasena = nueva_contrasena;
	}//constructor
	public ChangePasswordAdmin() {} //constructor
	
	//Abajo get y set
	
	public String getUsuario() {
		return usuario;
	}//getUsuario
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}//setUsuario
	public String getContrasena() {
		return contrasena;
	}//getContrasena
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}//setContrasena
	public String getNueva_contrasena() {
		return nueva_contrasena;
	}//getNueva_contrasena
	public void setNueva_contrasena(String nueva_contrasena) {
		this.nueva_contrasena = nueva_contrasena;
	}//setNueva_contrasena
	@Override
	public String toString() {
		return "ChangePasswordAdmin [usuario=" + usuario + ", contrasena=" + contrasena + ", nueva_contrasena="
				+ nueva_contrasena + "]";
	}//toString
	
}//class ChangePasswordAdmin
