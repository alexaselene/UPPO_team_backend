package com.uppoteam.ecommercemariaharo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_pedido")
public class DetallePedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iddetalle_pedido",unique = true, nullable = false)
	private Long id;
	private double precio_unitario;
	private int cantidad;
	private Long productos_idproductos;
	private Long pedido_idpedido;
	private Long pedido_usuarios_idusuario;
	
	// Constructor
	public DetallePedido(Long id, double precio_unitario, int cantidad, Long productos_idproductos,
			Long pedido_idpedido, Long pedido_usuarios_idusuario) {
		super();
		this.id = id;
		this.precio_unitario = precio_unitario;
		this.cantidad = cantidad;
		this.productos_idproductos = productos_idproductos;
		this.pedido_idpedido = pedido_idpedido;
		this.pedido_usuarios_idusuario = pedido_usuarios_idusuario;
	} 

	/*public DetallePedido(Long id, double precio_unitario, int cantidad) {
		super();
		this.id = id;
		this.precio_unitario = precio_unitario;
		this.cantidad = cantidad;
	} */
	
	
	// Constructor vacío
	public DetallePedido() {
		
	}

	/*
	public double getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "DetallePedido [id=" + id + ", precio_unitario=" + precio_unitario + ", cantidad=" + cantidad + "]";
	} 
	*/
	
	
	// Getters y Setters
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Long getId() {
		return id;
	}

	public double getPrecio_unitario() {
		return precio_unitario;
	}

	public Long getProductos_idproductos() {
		return productos_idproductos;
	}

	public Long getPedido_idpedido() {
		return pedido_idpedido;
	}

	public Long getPedido_usuarios_idusuario() {
		return pedido_usuarios_idusuario;
	}

	// toString
	@Override
	public String toString() {
		return "detalle_pedido [id=" + id + ", precio_unitario=" + precio_unitario + ", cantidad=" + cantidad
				+ ", productos_idproductos=" + productos_idproductos + ", pedido_idpedido=" + pedido_idpedido
				+ ", pedido_usuarios_idusuario=" + pedido_usuarios_idusuario + "]";
	}
}

