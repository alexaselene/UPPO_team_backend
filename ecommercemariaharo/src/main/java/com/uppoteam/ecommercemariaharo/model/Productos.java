package com.uppoteam.ecommercemariaharo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Productos {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idproductos" , unique=true, nullable=false)
		private long id;
		private String nombre;
		private String caracteristicas;
		private double precio_producto;
		private int stock;
		private String imagen;
		
		
		
		
		public Productos(long id, String nombre, String caracteristicas, double precio_producto, int stock, String imagen) {
			super();
			this.id=id;
			this.nombre = nombre;
			this.caracteristicas = caracteristicas;
			this.precio_producto = precio_producto;
			this.stock = stock;
			this.imagen = imagen;
			
		}///Productos

		public Productos() {
			
		}//constructor vacio

		

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCaracteristicas() {
			return caracteristicas;
		}

		public void setCaracteristicas(String caracteristicas) {
			this.caracteristicas = caracteristicas;
		}

		public double getPrecio_producto() {
			return precio_producto;
		}

		public void setPrecio_producto(double precio_producto) {
			this.precio_producto = precio_producto;
		}

		public int getStock() {
			return stock;
		}

		public void setStock(int stock) {
			this.stock = stock;
		}

		public String getImagen() {
			return imagen;
		}

		public void setImagen(String imagen) {
			this.imagen = imagen;
		}

		@Override
		public String toString() {
			return "Productos [id=" + id + ", nombre=" + nombre + ", caracteristicas=" + caracteristicas
					+ ", precio_producto=" + precio_producto + ", stock=" + stock + ", imagen=" + imagen + "]";
		}

		
		
		
}//class productos