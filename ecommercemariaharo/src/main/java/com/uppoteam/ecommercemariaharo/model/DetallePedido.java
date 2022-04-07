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
	
	
	// Constructor
	public DetallePedido(Long id, double precio_unitario, int cantidad, Long productos_idproductos,
			Long pedido_idpedido) {
		super();
		this.id = id;
		this.precio_unitario = precio_unitario;
		this.cantidad = cantidad;
		this.productos_idproductos = productos_idproductos;
		this.pedido_idpedido = pedido_idpedido;
		
	} 

	
	
	// Constructor vacío
	public DetallePedido() {
		
	}

	
	
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

	

	// toString
	@Override
	public String toString() {
		return "detalle_pedido [id=" + id + ", precio_unitario=" + precio_unitario + ", cantidad=" + cantidad
				+ ", productos_idproductos=" + productos_idproductos + ", pedido_idpedido=" + pedido_idpedido
				+ ", pedido_usuarios_idusuario=" + "]";
	}
}

