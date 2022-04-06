package com.uppoteam.ecommercemariaharo.model;

public class ChangePasswordAdmin {
	private String usuario;
	private String contrase�a;
	private String nueva_contrase�a;
	public ChangePasswordAdmin(String usuario, String contrase�a, String nueva_contrase�a) {
		
		this.usuario = usuario;
		this.contrase�a = contrase�a;
		this.nueva_contrase�a = nueva_contrase�a;
	}//constructor
	public ChangePasswordAdmin() {} //constructor vac�o
	
	//Abajo get y set
	
	public String getUsuario() {
		return usuario;
	}//getUsuario
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}//setUsuario
	public String getContrase�a() {
		return contrase�a;
	}//getContrase�a
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}//setContrase�a
	public String getNueva_contrase�a() {
		return nueva_contrase�a;
	}//getNueva_contrase�a
	public void setNueva_contrase�a(String nueva_contrase�a) {
		this.nueva_contrase�a = nueva_contrase�a;
	}//setNueva_contrase�a
	@Override
	public String toString() {
		return "ChangePasswordAdmin [usuario=" + usuario + ", contrase�a=" + contrase�a + ", nueva_contrase�a="
				+ nueva_contrase�a + "]";
	}//toString
	
}//class ChangePasswordAdmin
