package com.uppoteam.ecommercemariaharo.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uppoteam.ecommercemariaharo.model.Pedidos;

@Service
public class PedidosService {
	private final PedidosRepository pedidosRepository;
	
	@Autowired
	public PedidosService(PedidosRepository pedidosRepository) {
		this.pedidosRepository = pedidosRepository;
	}

	// GET
	public List<Pedidos> getPedidos() {
		// TODO Auto-generated method stub
		return pedidosRepository.findAll();
	}
    
	//DELETE
	public Pedidos getPedido(Long id) {
		return pedidosRepository.findById(id).orElseThrow(
				()-> new IllegalStateException("El producto con el id " + id + "no existe."));
	}

	public Pedidos deletePedido(Long id) {
		Pedidos pedido_del = null;
		if (pedidosRepository.existsById(id)) {
			pedido_del = pedidosRepository.findById(id).get();
			pedidosRepository.deleteById(id);
		}
		return pedido_del;
	}

	//POST
	public Pedidos addPedido(Pedidos pedido) {
		Pedidos pedido_post= null;
		Optional<Pedidos> prodById=pedidosRepository.findById(pedido.getId());
		if(prodById.isPresent()) {
			throw new IllegalStateException("El Producto con el nombre [" + pedido.getId() + 
					"] YA existe."); 	
		} else {
			pedidosRepository.save(pedido);
			pedido_post = pedido;
		}//else 
		return pedido_post;
	}	
}
