package com.uppoteam.ecommercemariaharo.model;

public class ChangePassword {
	
	private String Nombre_usuario;
	private String contrasena;
	private String nueva_contrasena;
	
	public ChangePassword(String nombre_usuario, String contrasena, String nueva_contrasena) {
	
		Nombre_usuario = nombre_usuario;
		this.contrasena = contrasena;
		this.nueva_contrasena = nueva_contrasena;
	}//constructor

	public ChangePassword() {
		
	}//constructor

	public String getNombre_usuario() {
		return Nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		Nombre_usuario = nombre_usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getNueva_contrasena() {
		return nueva_contrasena;
	}

	public void setNueva_contrasena(String nueva_contrasena) {
		this.nueva_contrasena = nueva_contrasena;
	}
	
	//Getters y Setters

	@Override
	public String toString() {
		return "ChangePassword [Nombre_usuario=" + Nombre_usuario + ", contrasena=" + contrasena + ", nueva_contrasena="
				+ nueva_contrasena + "]";
	}//toString
	
	
}//ChangePassword
