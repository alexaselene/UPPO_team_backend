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
	private Long usuarios_idusuario;
	
	public Pedidos(Long id, String fecha, String estado, Double total, Long usuarios_idusuario) {
		this.id = id;
		this.fecha = fecha;
		this.estado = estado;
		this.total = total;
		this.usuarios_idusuario = usuarios_idusuario;
	}
	
	// Constructor vacío
	public Pedidos() {
		
	} // Constructor vacío

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Long getId() {
		return id;
	}

	public Long getUsuarios_idusuario() {
		return usuarios_idusuario;
	}

	@Override
	public String toString() {
		return "Pedidos [id=" + id + ", fecha=" + fecha + ", estado=" + estado + ", total=" + total
				+ ", usuarios_idusuario=" + usuarios_idusuario + "]";
	}
	
} //class Pedidos
