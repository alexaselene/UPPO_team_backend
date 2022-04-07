package com.uppoteam.ecommercemariaharo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uppoteam.ecommercemariaharo.model.DetallePedido;
import com.uppoteam.ecommercemariaharo.service.DetallePService;

@RestController
@RequestMapping (path = "/api/detalle-pedido/")
public class DetallePController {
	private final DetallePService detallePService;
	
	@Autowired
	public DetallePController(DetallePService detallePService) {
		this.detallePService = detallePService;
	}
	
	// GET
	@GetMapping
	public List<DetallePedido> getDetallePedidos(){
		return detallePService.getDetallePedidos();
	}
	
	@GetMapping(path = "{detallepId}")
	public DetallePedido getDetallePedido (@PathVariable ("detallepId") Long id) {
		return detallePService.getDetallePedido(id);
	}
	
	// DELETE
	@DeleteMapping(path = "{detallepId}")
	public DetallePedido deleteDetallePedido(@PathVariable ("detallepId") Long id) {
		return detallePService.deleteDetallePedido(id);
	}

	
	
	//POST
	@PostMapping
	public void addDetallePedido(@RequestBody DetallePedido detallep) {
		detallePService.addDetallePedido(detallep);
	}//addAdministrador
	
	//PUT
	
	@PutMapping (path = "{detallepId}")
	public DetallePedido updateDetallePedido(@PathVariable ("detallepId") Long id,
			@RequestParam (required= false) Integer cantidad) {
	return detallePService.updateDetallePedido(id, cantidad);
	}
			

}
