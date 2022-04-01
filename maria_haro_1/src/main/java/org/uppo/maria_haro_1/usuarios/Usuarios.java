package org.uppo.maria_haro_1.usuarios;

public class Usuarios {
	private String nombre_usuario;
	private String contraseña;
	private String nombre_apellidos;
	private String telefono;
	private int id;
	private static int total=0;
	
	public Usuarios(String nombre_usuario, String contraseña, String nombre_apellidos, String telefono) {
		super();
		this.nombre_usuario = nombre_usuario;
		this.contraseña = contraseña;
		this.nombre_apellidos = nombre_apellidos;
		this.telefono = telefono;
		total++;
		this.id = total;
	}//Usuarios
	
	
	public Usuarios() {
		total++;
		this.id = total;
	}//Usuarios


	public String getNombre_usuario() {
		return nombre_usuario;
	}//getNombre_usuario


	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}//setNombre_usuario


	public String getContraseña() {
		return contraseña;
	}//getContraseña


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}//setContraseña


	public String getNombre_apellidos() {
		return nombre_apellidos;
	}//getNombre_apellidos


	public void setNombre_apellidos(String nombre_apellidos) {
		this.nombre_apellidos = nombre_apellidos;
	}//setNombre_apellido


	public String getTelefono() {
		return telefono;
	}//getTelefono


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}//setTelefono


	public int getId() {
		return id;
	}//getId


	@Override
	public String toString() {
		return "Usuarios [nombre_usuario=" + nombre_usuario + ", contraseña=" + contraseña + ", nombre_apellidos="
				+ nombre_apellidos + ", telefono=" + telefono + ", id=" + id + "]";
	}//toString
	
	
	
	
	
	
	
	
	
	

}//class Usuarios
