package com.uppoteam.ecommercemariaharo.model;

public class ChangePassword {
	
	private String Nombre_usuario;
	private String contraseña;
	private String nueva_contraseña;
	
	public ChangePassword(String nombre_usuario, String contraseña, String nueva_contraseña) {
	
		Nombre_usuario = nombre_usuario;
		this.contraseña = contraseña;
		this.nueva_contraseña = nueva_contraseña;
	}//constructor

	public ChangePassword() {
		
	}//constructor vacio

	public String getNombre_usuario() {
		return Nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		Nombre_usuario = nombre_usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getNueva_contraseña() {
		return nueva_contraseña;
	}

	public void setNueva_contraseña(String nueva_contraseña) {
		this.nueva_contraseña = nueva_contraseña;
	}
	
	//Getters y Setters

	@Override
	public String toString() {
		return "ChangePassword [Nombre_usuario=" + Nombre_usuario + ", contraseña=" + contraseña + ", nueva_contraseña="
				+ nueva_contraseña + "]";
	}//toString
	
	
}//ChangePassword
