package com.uppoteam.ecommercemariaharo.model;

public class ChangePassword {
	
	private String Nombre_usuario;
	private String contrase�a;
	private String nueva_contrase�a;
	
	public ChangePassword(String nombre_usuario, String contrase�a, String nueva_contrase�a) {
	
		Nombre_usuario = nombre_usuario;
		this.contrase�a = contrase�a;
		this.nueva_contrase�a = nueva_contrase�a;
	}//constructor

	public ChangePassword() {
		
	}//constructor vacio

	public String getNombre_usuario() {
		return Nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		Nombre_usuario = nombre_usuario;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public String getNueva_contrase�a() {
		return nueva_contrase�a;
	}

	public void setNueva_contrase�a(String nueva_contrase�a) {
		this.nueva_contrase�a = nueva_contrase�a;
	}
	
	//Getters y Setters

	@Override
	public String toString() {
		return "ChangePassword [Nombre_usuario=" + Nombre_usuario + ", contrase�a=" + contrase�a + ", nueva_contrase�a="
				+ nueva_contrase�a + "]";
	}//toString
	
	
}//ChangePassword
