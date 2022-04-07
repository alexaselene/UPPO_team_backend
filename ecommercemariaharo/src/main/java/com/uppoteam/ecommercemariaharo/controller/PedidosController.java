package com.uppoteam.ecommercemariaharo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uppoteam.ecommercemariaharo.model.Pedidos;
import com.uppoteam.ecommercemariaharo.service.PedidosService;

@RestController
@CrossOrigin("*")
@RequestMapping (path = "/api/pedidos/")
public class PedidosController {
	private final PedidosService pedidosService;
	
	@Autowired
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
	
	//POST
	@PostMapping
    public Pedidos addPedido(@RequestBody Pedidos pedido)	{
		return pedidosService.addPedido(pedido);
	}
	
	//PUT
	@PutMapping (path = "{pedidoId}")
	public Pedidos updatePedido(@PathVariable ("pedidoId") Long id, 
		@RequestParam (required= false) String fecha,
		@RequestParam (required= false) String estado) {
		
		return pedidosService.updatePedido(id, fecha, estado);
	}
	
}
