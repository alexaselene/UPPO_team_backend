package org.uppo.maria_haro_1.productos;

public class Productos {
	private String nombre;
	private String caracteristicas;
	private double precio_producto;
	private int stock;
	private String imagen;
	
	private int id;
	private static int total = 0;
	
	public Productos(String nombre, String caracteristicas, double precio_producto, int stock, String imagen
			) {
		super();
		this.nombre = nombre;
		this.caracteristicas = caracteristicas;
		this.precio_producto = precio_producto;
		this.stock = stock;
		this.imagen = imagen;
		total++;
		this.id=total;
	}//Productos
	

	
	public Productos() {
		total++;
		this.id = total;
	}// Constructor Defaul




	public String getNombre() {
		return nombre;
	}// getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public String getCaracteristicas() {
		return caracteristicas;
	}//getCaracteristicas
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}//setCaracteristicas
	public double getPrecio_producto() {
		return precio_producto;
	}//getPrecio_producto
	public void setPrecio_producto(double precio_producto) {
		this.precio_producto = precio_producto;
	}//setPrecio_producto
	public int getStock() {
		return stock;
	}// getStock
	public void setStock(int stock) {
		this.stock = stock;
	}//setStock
	public String getImagen() {
		return imagen;
	}//getImagen
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}//setImagen
	
	public int getId() {
		return id;
	}//getId
	
   
	

	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", caracteristicas=" + caracteristicas + ", precio_producto="
				+ precio_producto + ", stock=" + stock + ", imagen=" + imagen +    ", id="
				+ id + "]";
	}//toString

	
	

	
	
	
	
	
}//Productos