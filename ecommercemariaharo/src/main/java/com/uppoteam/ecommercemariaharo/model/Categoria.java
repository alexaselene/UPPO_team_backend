package com.uppoteam.ecommercemariaharo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "idcategoria", unique = true, nullable = false)
	private Long id;
	private String nombre_categoria;
	
	public Categoria(Long id, String nombre_categoria) {
		this.id = id;
		this.nombre_categoria = nombre_categoria;
	}// Constructor

	public Categoria() {} //constructor vacío

	public String getNombre_categoria() {
		return nombre_categoria;
	}//getNombre_categoria

	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}//setNombre_categoria

	public Long getId() {
		return id;
	}//getId

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre_categoria=" + nombre_categoria + "]";
	}//toString
	
	
	
	
	
	
}//classCategoria
