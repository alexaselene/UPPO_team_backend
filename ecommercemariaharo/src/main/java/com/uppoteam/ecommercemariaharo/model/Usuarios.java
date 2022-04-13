package com.uppoteam.ecommercemariaharo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")

public class Usuarios {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="idusuario", unique=true, nullable=false)
	    private int id;
		private String nombre_usuario;
		private String contrasena;
		private String nombre_apellidos;
		private String telefono;
		private static int total=0;
		
		public Usuarios(String nombre_usuario, String contrasena, String nombre_apellidos, String telefono) {
			this.nombre_usuario = nombre_usuario;
			this.contrasena = contrasena;
			this.nombre_apellidos = nombre_apellidos;
			this.telefono = telefono;
			total++;
			this.id = total;
		}//Constructor Usuarios
		
		public Usuarios() {}//ConstructorUsuarios

// Abajo Get y Set
		public String getNombre_usuario() {
			return nombre_usuario;
		}//getNombre_usuario


		public void setNombre_usuario(String nombre_usuario) {
			this.nombre_usuario = nombre_usuario;
		}//setNombre_usuario


		public String getContrasena() {
			return contrasena;
		}//getContrasena


		public void setContrasena(String contrasena) {
			this.contrasena = contrasena;
		}//setContrasena


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
			return "Usuarios [nombre_usuario=" + nombre_usuario + ", contrasena=" + contrasena + ", nombre_apellidos="
					+ nombre_apellidos + ", telefono=" + telefono + ", id=" + id + "]";
		}//toString

		
	

} //class Usuarios 
