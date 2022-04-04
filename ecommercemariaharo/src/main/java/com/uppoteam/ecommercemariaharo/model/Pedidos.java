package com.uppoteam.ecommercemariaharo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedidos {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "idpedido", unique = true, nullable = false)
	private Long id;
	private String fecha;
	private String estado;
	private Double total;
	
	// Constructor
	public Pedidos(Long id, String fecha, String estado, Double total) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.estado = estado;
		this.total = total;
	} // Constructor
	
	// Constructor vacío
	public Pedidos() {
		
	} // Constructor vacío

	public String getFecha() {
		return fecha;
	} //getFecha

	public void setFecha(String fecha) {
		this.fecha = fecha;
	} // setFecha

	public String getEstado() {
		return estado;
	} //getEstado

	public void setEstado(String estado) {
		this.estado = estado;
	} // setEstado

	public Double getTotal() {
		return total;
	} //getTotal

	public void setTotal(Double total) {
		this.total = total;
	} // setTotal

	public Long getId() {
		return id;
	} // getId

	// toString
	@Override
	public String toString() {
		return "Pedidos [id=" + id + ", fecha=" + fecha + ", estado=" + estado + ", total=" + total + "]";
	} // toString
	
} //class Pedidos
