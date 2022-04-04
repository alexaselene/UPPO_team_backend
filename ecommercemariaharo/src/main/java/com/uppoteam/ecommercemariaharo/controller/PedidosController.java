package com.uppoteam.ecommercemariaharo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uppoteam.ecommercemariaharo.model.Pedidos;
import com.uppoteam.ecommercemariaharo.service.PedidosService;

@RestController
@RequestMapping (path = "/api/pedidos/")
public class PedidosController {
	private final PedidosService pedidosService;
	
	public PedidosController(PedidosService pedidosService) {
		this.pedidosService = pedidosService;
	}
	
	// GET
	@GetMapping
	public List<Pedidos> getPedidos(){
		return pedidosService.getPedidos();
	}
	
	@GetMapping(path = "{pedidoId}")
	public Pedidos getPedido (@PathVariable ("pedidoId") Long id){
		return pedidosService.getPedido(id);
	}
	
	// DELETE
	@DeleteMapping(path = "{pedidoId}")
	public Pedidos deletePedido(@PathVariable ("pedidoId") Long id) {
		return pedidosService.deletePedido(id);
	}
}
